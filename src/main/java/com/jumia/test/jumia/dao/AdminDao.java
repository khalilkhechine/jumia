package com.jumia.test.jumia.dao;

import com.jumia.test.jumia.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao  extends JpaRepository<Admin, Long> {

    Admin findByEmailAndPassword(String email, String password);
}
