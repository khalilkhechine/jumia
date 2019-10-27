package com.jumia.test.jumia.service;

import com.jumia.test.jumia.entity.Product;

import java.util.List;

public interface ProductService {

    Product create(Product product);

    Product update(Long id, Product product) throws Exception;

    Product findById(Long id);

    void delete(Long id) throws Exception;

    List<Product> findAll();
}
