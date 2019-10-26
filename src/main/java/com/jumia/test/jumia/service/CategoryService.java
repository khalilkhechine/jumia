package com.jumia.test.jumia.service;

import com.jumia.test.jumia.entity.Admin;
import com.jumia.test.jumia.entity.Category;

import java.util.List;

public interface CategoryService {

    Category create(Category category);
    Category update(Long id, Category category) throws Exception;
    Category findById(Long id);
    void delete(Long id) throws Exception;
    List<Category> findAll();
}
