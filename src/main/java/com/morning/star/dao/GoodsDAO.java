package com.morning.star.dao;

import com.morning.star.bean.RelationBean;
import com.morning.star.bean.RetailGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface GoodsDAO {

    List<RetailGoods> selectAll(List<RelationBean> list);

    RetailGoods getInfo(@Param("list") List<RelationBean> list, @Param("goodsCode") String goodsCode);

    int addGoods(RetailGoods retailGoods);

}
