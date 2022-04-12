package edu.gdpu.mybatisdemo.dao;

import edu.gdpu.mybatisdemo.pojo.Order;


public interface OrderMapper {
    public Order queryOrderWithProducts(int id);
}
