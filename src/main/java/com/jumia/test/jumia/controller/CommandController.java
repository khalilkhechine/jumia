package com.jumia.test.jumia.controller;

import com.jumia.test.jumia.entity.Command;
import com.jumia.test.jumia.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CommandController  {
    @PostMapping
    ResponseEntity<Command> create(@RequestBody Command command);

    @PutMapping("/{id}")
    ResponseEntity<Command> update(@PathVariable Long id , @RequestBody Command command);

    @GetMapping("/{id}")
    ResponseEntity<Command> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<Command>> findAll();

    @DeleteMapping("/{id}")
    ResponseEntity<String> delete(@PathVariable Long id);
}
