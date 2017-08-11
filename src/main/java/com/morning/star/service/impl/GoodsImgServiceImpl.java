package com.morning.star.service.impl;

import com.morning.star.bean.RetailGoodsImg;
import com.morning.star.dao.GoodsImgDAO;
import com.morning.star.service.GoodsImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
@Service("goodsImgService")
public class GoodsImgServiceImpl implements GoodsImgService {

    @Autowired
    private GoodsImgDAO goodsImgDAO;

    @Override
    public List<RetailGoodsImg> selectAll() {
        return this.goodsImgDAO.selectAll();
    }

    @Override
    public int addGoodsImg(RetailGoodsImg retailGoodsImg) {
        return this.goodsImgDAO.addGoodsImg(retailGoodsImg);
    }
}
