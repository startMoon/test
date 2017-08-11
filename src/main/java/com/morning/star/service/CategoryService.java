package com.morning.star.service;

import com.morning.star.bean.RetailCategory;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface CategoryService {

    List<RetailCategory> selectTohomeAll();

    int addCategory(RetailCategory retailCategory);

}
