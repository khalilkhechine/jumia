package com.jumia.test.jumia.controller.impl;

import com.jumia.test.jumia.dto.LoginDetails;
import com.jumia.test.jumia.controller.AdminController;
import com.jumia.test.jumia.entity.Admin;
import com.jumia.test.jumia.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdminControllerImpl implements AdminController {

    @Autowired
    private AdminService adminService;

    @Override
    public ResponseEntity<Admin> create(Admin admin) {

        ResponseEntity<Admin> adminResponseEntity;
        try {
            adminResponseEntity = new ResponseEntity<>(adminService.create(admin), HttpStatus.CREATED);
        } catch (Exception e) {
            adminResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return adminResponseEntity;
    }

    @Override
    public ResponseEntity<Admin> update(Long id, Admin admin) {
        return null;
    }

    @Override
    public ResponseEntity<Admin> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Admin>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<String> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Admin> login(LoginDetails loginDetails) {
        return null;
    }
}
