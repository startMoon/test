package com.morning.star.dao;

import com.morning.star.bean.RetailUnits;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface UnitsDAO {
    List<RetailUnits> selectAll();

    RetailUnits getInfo(@Param("id") Integer id);

    int addUnits(RetailUnits retailUnits);
}
