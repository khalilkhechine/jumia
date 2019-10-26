package com.jumia.test.jumia.service.impl;

import com.jumia.test.jumia.dao.AdminDao;
import com.jumia.test.jumia.entity.Admin;
import com.jumia.test.jumia.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin create(Admin admin) {
        return adminDao.save(admin);
    }

    @Override
    public Admin update(Long id, Admin admin) throws Exception {
        Admin adminToUpdate = findById(id);
        if (admin == null) {
            throw new Exception("this admin is not found");
        }
        adminToUpdate.setFirstName(admin.getFirstName());
        adminToUpdate.setLastName(admin.getLastName());
        adminToUpdate.setEmail(admin.getEmail());
        adminToUpdate.setPassword(admin.getPassword());
        adminToUpdate.setJob(admin.getJob());
        return adminDao.save(adminToUpdate);
    }

    @Override
    public Admin findById(Long id) {
        return adminDao.getOne(id);
    }

    @Override
    public void delete(Long id) throws Exception {
        Admin admin = findById(id);
        if (admin == null) {
            throw new Exception("This admin is not found");
        }
        adminDao.delete(admin);
    }

    @Override
    public List<Admin> findAll() {
        return adminDao.findAll();
    }

    @Override
    public Admin findByEmailAndPassword(String email, String password) {
        return adminDao.findByEmailAndPassword(email, password);
    }
}
