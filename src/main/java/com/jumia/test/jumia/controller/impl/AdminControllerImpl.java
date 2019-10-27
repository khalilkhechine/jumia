package com.jumia.test.jumia.controller.impl;

import com.jumia.test.jumia.controller.AdminController;
import com.jumia.test.jumia.dto.LoginDetails;
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
        ResponseEntity<Admin> adminResponseEntity;
        try {
            adminResponseEntity = new ResponseEntity<>(adminService.update(id, admin), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            adminResponseEntity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return adminResponseEntity;
    }

    @Override
    public ResponseEntity<Admin> findById(Long id) {
        ResponseEntity<Admin> adminResponseEntity;
        try {
            adminResponseEntity = new ResponseEntity<>(adminService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            adminResponseEntity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return adminResponseEntity;
    }

    @Override
    public ResponseEntity<List<Admin>> findAll() {
        ResponseEntity<List<Admin>> adminResponseEntity;
        try {
            adminResponseEntity = new ResponseEntity<>(adminService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            adminResponseEntity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return adminResponseEntity;
    }

    @Override
    public ResponseEntity<String> delete(Long id) {

        ResponseEntity<String> adminResponseEntity;
        try {
            adminService.delete(id);
            adminResponseEntity = new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            adminResponseEntity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return adminResponseEntity;
    }

    @Override
    public ResponseEntity<Admin> login(LoginDetails loginDetails) {
        ResponseEntity<Admin> adminResponseEntity;
        try {

            adminResponseEntity = new ResponseEntity<>(adminService.findByEmailAndPassword(loginDetails.getEmail(), loginDetails.getPassword()), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            adminResponseEntity = new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
        return null;
    }
}
