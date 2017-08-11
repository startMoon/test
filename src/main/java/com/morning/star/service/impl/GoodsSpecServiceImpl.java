package com.morning.star.service.impl;

import com.morning.star.bean.RetailGoodsSpec;
import com.morning.star.dao.GoodsSpecDAO;
import com.morning.star.service.GoodsSpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/8/11.
 */
@Service("goodsSpecService")
public class GoodsSpecServiceImpl implements GoodsSpecService {

    @Autowired
    private GoodsSpecDAO goodsSpecDAO;

    @Override
    public List<RetailGoodsSpec> selectAll() {
        return goodsSpecDAO.selectAll();
    }

    @Override
    public int addGoodsSpec(RetailGoodsSpec retailGoodsSpec) {
        return goodsSpecDAO.addGoodsSpec(retailGoodsSpec);
    }
}
