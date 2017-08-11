package com.morning.star.dao;

import com.morning.star.bean.RelationBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface RelationDAO {

    List<RelationBean> selectAll(@Param("name") String name);

}
