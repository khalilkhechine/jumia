package com.jumia.test.jumia.controller;


import com.jumia.test.jumia.dto.LoginDetails;
import com.jumia.test.jumia.entity.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public interface ClientController {
    @PostMapping
    ResponseEntity<Client> create(@RequestBody Client client);

    @PutMapping("/{id}")
    ResponseEntity<Client> update(@PathVariable Long id, @RequestBody Client client);

    @GetMapping("/{id}")
    ResponseEntity<Client> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<Client>> findAll();

    @DeleteMapping("/{id}")
    ResponseEntity<String> delete(@PathVariable Long id);

    @PostMapping("/login")
    ResponseEntity<Client> login(@RequestBody LoginDetails loginDetails);

    @GetMapping("/search-by-email/{email}")
    ResponseEntity<List<Client>> searchByEmail(@PathVariable String email);



}
