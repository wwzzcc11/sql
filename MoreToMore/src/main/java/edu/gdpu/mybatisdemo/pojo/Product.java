package edu.gdpu.mybatisdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private  int id;
    private  String name;
    private  double price;
    private List<Order> orders;
}
