package com.morning.star.service.impl;

import com.morning.star.bean.RetailCategory;
import com.morning.star.dao.CategoryDAO;
import com.morning.star.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    public List<RetailCategory> selectTohomeAll() {
        return this.categoryDAO.selectAll();
    }

    public int addCategory(RetailCategory retailCategory) {
        return this.categoryDAO.addCategory(retailCategory);
    }
}
