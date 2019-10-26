package com.jumia.test.jumia.dao;

import com.jumia.test.jumia.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientDao extends JpaRepository<Client, Long> {

    Client findByEmailAndPassword(String email, String password);
}
