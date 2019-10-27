package com.jumia.test.jumia.service.impl;

import com.jumia.test.jumia.dao.CategoryDao;
import com.jumia.test.jumia.entity.Category;
import com.jumia.test.jumia.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Category create(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public Category update(Long id, Category category) throws Exception {
        Category categoryToUpdate = findById(id);
        if (categoryToUpdate == null) {
            throw new Exception("Category not found");
        }
        categoryToUpdate.setName(category.getName());
        return categoryDao.save(categoryToUpdate);
    }

    @Override
    public Category findById(Long id) {
        return categoryDao.getOne(id);
    }

    @Override
    public void delete(Long id) throws Exception {
        Category category = findById(id);
        if (category == null) {
            throw new Exception("Category not found");
        }
        categoryDao.delete(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }
}
