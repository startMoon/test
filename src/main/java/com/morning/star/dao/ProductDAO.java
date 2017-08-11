package com.morning.star.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface ProductDAO {

    String getSpuCode(@Param("goodsCode") String goodsCode);

}
