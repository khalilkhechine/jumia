package com.jumia.test.jumia.dao;

import com.jumia.test.jumia.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Long> {

    Client findByEmailAndPassword(String email, String password);
}
