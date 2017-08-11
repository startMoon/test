package com.morning.star.service;

import com.morning.star.bean.RetailUnits;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface UnitsService {

    List<RetailUnits> selectAll();

    RetailUnits getInfo(Integer id);

    int addUnits(RetailUnits retailUnits);

}
