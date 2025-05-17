package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

public interface ShoppingService {

    //添加购物车
    void add(ShoppingCartDTO shoppingCartDTO);


    //查询购物车
    List<ShoppingCart> list();

    //清空购物车
    void clean();
}
