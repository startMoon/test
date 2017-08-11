package com.morning.star.dao;

import com.morning.star.bean.RetailCategory;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface CategoryDAO {

    List<RetailCategory> selectAll();

    int addCategory(RetailCategory retailCategory);

}
