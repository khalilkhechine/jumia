package com.jumia.test.jumia.service;

import com.jumia.test.jumia.entity.Admin;

import java.util.List;

public interface AdminService {

    Admin create(Admin admin);
    Admin update(Long id, Admin admin) throws Exception;
    Admin findById(Long id);
    void delete(Long id) throws Exception;
    List<Admin> findAll();
    Admin findByEmailAndPassword(String email, String password) throws Exception;
}
