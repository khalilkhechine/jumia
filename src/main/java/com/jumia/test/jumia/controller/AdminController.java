package com.jumia.test.jumia.controller;

import com.jumia.test.jumia.dto.LoginDetails;
import com.jumia.test.jumia.entity.Admin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public interface AdminController {

    @PostMapping
    ResponseEntity<Admin> create(@RequestBody Admin admin);

    @PutMapping("/{id}")
    ResponseEntity<Admin> update(@PathVariable Long id, @RequestBody Admin admin);

    @GetMapping("/{id}")
    ResponseEntity<Admin> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<Admin>> findAll();

    @DeleteMapping("/{id}")
    ResponseEntity<String> delete(@PathVariable Long id);

    @PostMapping("/login")
    ResponseEntity<Admin> login(@RequestBody LoginDetails loginDetails);


}
