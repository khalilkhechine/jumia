package com.jumia.test.jumia.controller.impl;

import com.jumia.test.jumia.controller.ClientController;
import com.jumia.test.jumia.dto.LoginDetails;
import com.jumia.test.jumia.entity.Admin;
import com.jumia.test.jumia.entity.Client;
import com.jumia.test.jumia.service.AdminService;
import com.jumia.test.jumia.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class ClientControllerImpl implements ClientController {

    @Autowired
    private ClientService clientService;
    @Override
    public ResponseEntity<Client> create(Client client) {
        ResponseEntity<Client> clientResponseEntity;
        try {
            clientResponseEntity = new ResponseEntity<>(clientService.create(client), HttpStatus.CREATED);
        } catch (Exception e) {
            clientResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return clientResponseEntity;

    }

    @Override
    public ResponseEntity<Client> update(Long id, Client client) {

        ResponseEntity<Client> clientResponseEntity;
        try {
            clientResponseEntity = new ResponseEntity<>(clientService.update(id,client), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            clientResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return clientResponseEntity;
    }

    @Override
    public ResponseEntity<Client> findById(Long id) {
        ResponseEntity<Client> clientResponseEntity;
        try {
            clientResponseEntity = new ResponseEntity<>(clientService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            clientResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return clientResponseEntity;
    }

    @Override
    public ResponseEntity<List<Client>> findAll() {

        ResponseEntity<List<Client>> clientResponseEntity;
        try {
            clientResponseEntity = new ResponseEntity<>(clientService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            clientResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return clientResponseEntity;


    }

    @Override
    public ResponseEntity<String> delete(Long id) {

        ResponseEntity<String> clientResponseEntity;
        try {
            clientService.delete(id);
            clientResponseEntity = new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            clientResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return clientResponseEntity;


    }

    @Override
    public ResponseEntity<Client> login(LoginDetails loginDetails) {
        ResponseEntity<Client> clientResponseEntity;

        try {
            clientResponseEntity = new ResponseEntity<>(clientService.findByEmailAndPassword(loginDetails.getEmail(),loginDetails.getPassword()), HttpStatus.OK);
        } catch (Exception e) {
            clientResponseEntity = new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return clientResponseEntity;


    }
}
