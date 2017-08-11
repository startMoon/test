package com.morning.star.service;

import com.morning.star.bean.RetailGoodsSpec;

import java.util.List;

/**
 * Created by lenovo on 2017/8/11.
 */
public interface GoodsSpecService {

    List<RetailGoodsSpec> selectAll();

    int addGoodsSpec(RetailGoodsSpec retailGoodsSpec);
}
