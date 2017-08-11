package com.morning.star.service;

import com.morning.star.bean.RetailBrand;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface BrandService {

    List<RetailBrand> selectAll();

    RetailBrand getInfo(Integer id);

    int addBrand(RetailBrand retailBrand);

}
