package com.jumia.test.jumia.controller.impl;

import com.jumia.test.jumia.controller.ProductController;
import com.jumia.test.jumia.entity.Client;
import com.jumia.test.jumia.entity.Product;
import com.jumia.test.jumia.service.ClientService;
import com.jumia.test.jumia.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class ProductControllerImpl implements ProductController {

    @Autowired
    private ProductService productService;
    @Override
    public ResponseEntity<Product> create(Product product) {

        ResponseEntity<Product> productResponseEntity;
        try {
            productResponseEntity = new ResponseEntity<>(productService.create(product), HttpStatus.CREATED);
        } catch (Exception e) {
            productResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return productResponseEntity;


    }

    @Override
    public ResponseEntity<Product> update(Long id, Product product) {

        ResponseEntity<Product> productResponseEntity;
            try {
                productResponseEntity = new ResponseEntity<>(productService.update(id,product), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                productResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
            return productResponseEntity;
    }

    @Override
    public ResponseEntity<Product> findById(Long id) {

        ResponseEntity<Product> productResponseEntity;
        try {
            productResponseEntity = new ResponseEntity<>(productService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            productResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return productResponseEntity;
    }

    @Override
    public ResponseEntity<List<Product>> findAll() {

        ResponseEntity<List<Product>> productResponseEntity;
        try {
            productResponseEntity = new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            productResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return productResponseEntity;
    }

    @Override
    public ResponseEntity<String> delete(Long id) {

        ResponseEntity<String> productResponseEntity;
        try {
            productService.delete(id);
            productResponseEntity = new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            productResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return productResponseEntity;
}
}
