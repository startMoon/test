package com.morning.star.service.impl;

import com.morning.star.dao.ProductDAO;
import com.morning.star.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/8/10.
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public String getSpuCode(String goodsCode) {
        return this.productDAO.getSpuCode(goodsCode);
    }
}
