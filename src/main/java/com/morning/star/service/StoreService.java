package com.morning.star.service;

import com.morning.star.bean.RetailStore;
import com.morning.star.bean.TohomeStore;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface StoreService {

    List<TohomeStore> selectAll();

    int addStore(RetailStore retailStore);
}
