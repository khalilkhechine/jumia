package com.jumia.test.jumia.dao;

import com.jumia.test.jumia.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Long> {
}
