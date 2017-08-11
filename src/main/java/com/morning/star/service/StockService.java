package com.morning.star.service;

import com.morning.star.bean.RetailStock;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface StockService {

    List<RetailStock> selectAll();

    int addStock(RetailStock retailStock);
}
