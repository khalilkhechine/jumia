package com.jumia.test.jumia.controller;

import com.jumia.test.jumia.dto.LoginDetails;
import com.jumia.test.jumia.entity.Admin;
import com.jumia.test.jumia.entity.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public interface CategoryController {

    @PostMapping
    ResponseEntity<Category> create(@RequestBody Category category);

    @PutMapping("/{id}")
    ResponseEntity<Category> update(@PathVariable Long id ,@RequestBody Category category);

    @GetMapping("/{id}")
    ResponseEntity<Category> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<Category>> findAll();

    @DeleteMapping("/{id}")
    ResponseEntity<String> delete(@PathVariable Long id);



}