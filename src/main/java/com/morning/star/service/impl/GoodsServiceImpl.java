package com.morning.star.service.impl;

import com.morning.star.bean.RelationBean;
import com.morning.star.bean.RetailGoods;
import com.morning.star.dao.GoodsDAO;
import com.morning.star.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDAO goodsDAO;

    @Override
    public List<RetailGoods> selectAll(List<RelationBean> list) {
        return this.goodsDAO.selectAll(list);
    }

    @Override
    public RetailGoods getInfo(List<RelationBean> list, String goodsCode) {
        return this.goodsDAO.getInfo(list, goodsCode);
    }

    @Override
    public int addGoods(RetailGoods retailGoods) {
        return this.goodsDAO.addGoods(retailGoods);
    }

}
