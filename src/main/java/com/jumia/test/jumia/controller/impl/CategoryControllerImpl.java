package com.jumia.test.jumia.controller.impl;

import com.jumia.test.jumia.controller.CategoryController;
import com.jumia.test.jumia.entity.Category;
import com.jumia.test.jumia.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CategoryControllerImpl implements CategoryController {
    @Autowired
    private CategoryService categoryservice;
    @Override
    public ResponseEntity<Category> create(Category category) {
        ResponseEntity<Category> adminResponseEntity;
        try {
            adminResponseEntity = new ResponseEntity<>(categoryservice.create(category), HttpStatus.CREATED);
        } catch (Exception e) {
            adminResponseEntity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return adminResponseEntity;
    }

    @Override
    public ResponseEntity<Category> update(Long id, Category category) {
        ResponseEntity<Category> adminResponseEntity;
        try {
            adminResponseEntity = new ResponseEntity<>(categoryservice.update(id,category), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            adminResponseEntity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return adminResponseEntity;
    }

    @Override
    public ResponseEntity<Category> findById(Long id) {
        ResponseEntity<Category> adminResponseEntity;
        try {
            adminResponseEntity = new ResponseEntity<>(categoryservice.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            adminResponseEntity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return adminResponseEntity;
    }

    @Override
    public ResponseEntity<List<Category>> findAll() {
        ResponseEntity<List<Category>> adminResponseEntity;
        try {
            adminResponseEntity = new ResponseEntity<>(categoryservice.findAll(), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            adminResponseEntity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return adminResponseEntity;
    }

    @Override
    public ResponseEntity<String> delete(Long id) {
        ResponseEntity<String> adminResponseEntity;
        try {
            categoryservice.delete(id);
            adminResponseEntity = new ResponseEntity<String>( HttpStatus.OK);
        } catch (Exception e) {
            adminResponseEntity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return adminResponseEntity;
    }

}
