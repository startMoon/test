package com.morning.star.dao;

import com.morning.star.bean.RetailBrand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface BrandDAO {

    List<RetailBrand> selectAll();

    RetailBrand getInfo(@Param("id") Integer id);

    int addBrand(RetailBrand retailBrand);
}
