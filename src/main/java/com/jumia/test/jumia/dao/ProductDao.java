package com.jumia.test.jumia.dao;

import com.jumia.test.jumia.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {
}
