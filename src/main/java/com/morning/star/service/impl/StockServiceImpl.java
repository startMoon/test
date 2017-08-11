package com.morning.star.service.impl;

import com.morning.star.bean.RetailStock;
import com.morning.star.dao.StockDAO;
import com.morning.star.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
@Service("stockService")
public class StockServiceImpl implements StockService {

    @Autowired
    private StockDAO stockDAO;

    @Override
    public List<RetailStock> selectAll() {
        return this.stockDAO.selectAll();
    }

    @Override
    public int addStock(RetailStock retailStock) {
        return this.stockDAO.addStock(retailStock);
    }
}
