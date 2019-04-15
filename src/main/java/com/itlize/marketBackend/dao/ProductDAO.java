package com.itlize.marketBackend.dao;

import java.util.List;
import java.util.Map;

import com.itlize.marketBackend.model.Product;

public interface ProductDAO {

    List<Product> getAllProducts(String category, String subCategory);
    List<String> getSubCate(String Cate);
    Product getProduct(String suffix);//get all the information of one single product
    List<Product> filter(Map filterParams);
    List<Product> search(String suffix); // what is this for?
    List<Product> compare(List<String> productIds);
    Product createProduct(Product product);

}
