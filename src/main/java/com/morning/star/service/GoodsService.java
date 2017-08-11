package com.morning.star.service;

import com.morning.star.bean.RelationBean;
import com.morning.star.bean.RetailGoods;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface GoodsService {

    List<RetailGoods> selectAll(List<RelationBean> list);

    RetailGoods getInfo(List<RelationBean> list, String goodsCode);

    int addGoods(RetailGoods retailGoods);

}
