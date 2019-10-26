package com.jumia.test.jumia.service;

import com.jumia.test.jumia.entity.Client;

import java.util.List;

public interface ClientService {

    Client create(Client client);
    Client update(Long id, Client client) throws Exception;
    Client findById(Long id);
    void delete(Long id) throws Exception;
    List<Client> findAll();
    Client findByEmailAndPassword(String email, String password);
}
