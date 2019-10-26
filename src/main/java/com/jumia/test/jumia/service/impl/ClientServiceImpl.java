package com.jumia.test.jumia.service.impl;

import com.jumia.test.jumia.dao.ClientDao;
import com.jumia.test.jumia.entity.Client;
import com.jumia.test.jumia.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public Client create(Client client) {
        return clientDao.save(client);
    }

    @Override
    public Client update(Long id, Client client) throws Exception {
        Client clientToUpdate = findById(id);
        if (clientToUpdate == null) {
            throw new Exception("This client is not found");
        }
        clientToUpdate.setFirstName(client.getFirstName());
        clientToUpdate.setLastName(client.getLastName());
        clientToUpdate.setEmail(client.getEmail());
        clientToUpdate.setPassword(client.getPassword());
        clientToUpdate.setAddress(client.getAddress());
        clientToUpdate.setPhoneNumber(client.getPhoneNumber());
        return clientDao.save(clientToUpdate);
    }

    @Override
    public Client findById(Long id) {
        return clientDao.getOne(id);
    }

    @Override
    public void delete(Long id) throws Exception {
        Client client = findById(id);
        if (client == null) {
            throw new Exception("This client is not found");
        }
        clientDao.delete(client);
    }

    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @Override
    public Client findByEmailAndPassword(String email, String password) throws Exception {
        Client client = clientDao.findByEmailAndPassword(email, password);
        if (client == null) {
            throw new Exception("Client not  found");
        }
        return client;
    }
}
