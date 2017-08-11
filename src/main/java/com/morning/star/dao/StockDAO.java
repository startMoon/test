package com.morning.star.dao;

import com.morning.star.bean.RetailStock;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface StockDAO {

    List<RetailStock> selectAll();

    int addStock(RetailStock retailStock);

}
