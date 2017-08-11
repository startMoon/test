package com.morning.star.dao;

import com.morning.star.bean.RetailGoodsImg;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface GoodsImgDAO {

    List<RetailGoodsImg> selectAll();

    int addGoodsImg(RetailGoodsImg retailGoodsImg);

}
