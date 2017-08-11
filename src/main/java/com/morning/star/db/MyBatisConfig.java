package com.morning.star.db;


import com.google.api.client.repackaged.com.google.common.base.Preconditions;
import com.pugwoo.dbhelper.impl.SpringJdbcDBHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * mybatis配置文件,采用spring boot 加载问题
 *
 * @author zhouwen
 */
@Configuration
@PropertySource({"classpath:config_center.properties"})
@EnableTransactionManagement
public class MyBatisConfig implements ApplicationContextAware {
    /**
     *
     */
    @SuppressWarnings("unused")
    private ApplicationContext context;
    @SuppressWarnings("unused")
    @Autowired
    private Environment env;
    @SuppressWarnings("unused")
    @Autowired
    private DataSource datesource;
    @SuppressWarnings("unused")
    @Autowired
    private SqlSessionFactory fatctory;

    /**
     * DB_BASE_PACKAGE
     */
    @SuppressWarnings("unused")
    private static final String DB_DOMAIN_PACKAGE = "jdbc.base.domain";

    /**
     * DB_BASE_PACKAGE
     */
    private static final String DB_DAO_PACKAGE = "jdbc.base.dao";

    /**
     * DB_BASE_PACKAGE
     */
    @SuppressWarnings("unused")
    private static final String DB_MAPPER_PACKAGE = "jdbc.base.mapper";


    /**
     * @param dataSource
     * @return
     */
    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }


    /**
     * 创建sqlSessionTemplate
     *
     * @param dataSource
     * @param env
     * @return
     * @throws Exception
     */
    @Bean(name = "sqlSessionFactory")
    @ConditionalOnMissingBean(SqlSessionTemplate.class)
    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource, Environment env) throws Exception {
        /*if(fatctory!=null){
            return fatctory;
    	}*/
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();

        // 开启查询结果驼峰自动切换
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        factoryBean.setConfiguration(configuration);

        factoryBean.setDataSource(dataSource);
        //factoryBean.setMapperLocations(context.getResources(EvnUtils.getStringValue(env,DB_MAPPER_PACKAGE)));
        //factoryBean.setTypeAliasesPackage(EvnUtils.getStringValue(env,DB_DOMAIN_PACKAGE));

        //page helper
        /*Interceptor[] interceptors = new Interceptor[1];
        factoryBean.setPlugins(interceptors);*/


        return factoryBean.getObject();
    }

    /**
     * mybatis扫描DAO包接口
     *
     * @return mapperScannerConfigurer
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(Environment env) {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setSqlSessionTemplateBeanName("sqlSessionTemplate");
        msc.setBasePackage(Preconditions.checkNotNull(env.getProperty(DB_DAO_PACKAGE)));//getCurrentDbConfig().get(	9+)));
        return msc;
    }


    /**
     * 设置applicationContext
     *
     * @param applicationContext applicationContext
     * @throws BeansException BeansException
     */
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }


    /**
     * 加载事物控制器
     *
     * @param datesource
     * @return
     */
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource datesource) {
        // TODO Auto-generated method stub
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(datesource);
        return transactionManager;
    }

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate jdbcTemplate(DataSource datesource) {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(datesource);
        return template;
    }

    @Bean(name = "namedParameterJdbcTemplate")
    public NamedParameterJdbcTemplate namedJdbcTemplate(DataSource datasource) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(datasource);
        return template;
    }

    @Bean(name = "dbHelper")
    public SpringJdbcDBHelper dbHelper(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        SpringJdbcDBHelper helper = new SpringJdbcDBHelper();
        helper.setJdbcTemplate(jdbcTemplate);
        helper.setNamedParameterJdbcTemplate(namedParameterJdbcTemplate);
        helper.setTimeoutWarningValve(600);
        return helper;
    }


}
