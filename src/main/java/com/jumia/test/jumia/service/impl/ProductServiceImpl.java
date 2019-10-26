package com.jumia.test.jumia.service.impl;

import com.jumia.test.jumia.dao.ProductDao;
import com.jumia.test.jumia.entity.Product;
import com.jumia.test.jumia.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product create(Product product) {
        return productDao.save(product);
    }

    @Override
    public Product update(Long id, Product product) throws Exception {
        Product productToUpdate = findById(id);
        if (productToUpdate == null) {
            throw new Exception("Product not found");
        }
        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setName(product.getName());
        productToUpdate.setDescription(product.getDescription());
        productToUpdate.setQuantity(product.getQuantity());
        productToUpdate.setCategory(product.getCategory());
        return productDao.save(productToUpdate);
    }

    @Override
    public Product findById(Long id) {
        return productDao.getOne(id);
    }

    @Override
    public void delete(Long id) throws Exception {
        Product product = findById(id);

        if (product == null) {
            throw new Exception("Product not found");
        }

        productDao.delete(product);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
}
