package com.morning.star.service.impl;

import com.morning.star.bean.RetailBrand;
import com.morning.star.dao.BrandDAO;
import com.morning.star.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
@Service("brandService")
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDAO brandDAO;

    @Override
    public List<RetailBrand> selectAll() {
        return this.brandDAO.selectAll();
    }

    @Override
    public RetailBrand getInfo(Integer id) {
        return this.brandDAO.getInfo(id);
    }

    @Override
    public int addBrand(RetailBrand retailBrand) {
        return this.brandDAO.addBrand(retailBrand);
    }
}
