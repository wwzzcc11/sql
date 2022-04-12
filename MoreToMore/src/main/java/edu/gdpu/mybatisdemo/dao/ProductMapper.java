package edu.gdpu.mybatisdemo.dao;

import edu.gdpu.mybatisdemo.pojo.Product;

public interface ProductMapper {
    public Product queryProductWithOrders(int id);
}
