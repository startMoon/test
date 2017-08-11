package com.morning.star.dao;

import com.morning.star.bean.RetailGoodsSpec;

import java.util.List;

/**
 * Created by lenovo on 2017/8/11.
 */
public interface GoodsSpecDAO {

    List<RetailGoodsSpec> selectAll();

    int addGoodsSpec(RetailGoodsSpec retailGoodsSpec);

}
