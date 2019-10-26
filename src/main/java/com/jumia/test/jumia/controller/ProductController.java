package com.jumia.test.jumia.controller;


import com.jumia.test.jumia.dto.LoginDetails;
import com.jumia.test.jumia.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public interface ProductController {

    @PostMapping
    ResponseEntity<Product> create(@RequestBody Product product);

    @PutMapping("/{id}")
    ResponseEntity<Product> update(@PathVariable Long id ,@RequestBody Product product);

    @GetMapping("/{id}")
    ResponseEntity<Product> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<Product>> findAll();

    @DeleteMapping("/{id}")
    ResponseEntity<String> delete(@PathVariable Long id);

   


}
