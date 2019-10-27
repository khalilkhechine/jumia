package com.jumia.test.jumia.dao;

import com.jumia.test.jumia.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientDao extends JpaRepository<Client, Long> {

    Client findByEmailAndPassword(String email, String password);

    @Query(value = "select c from Client c where c.email like %?1%")
    //@Query(value = "select *  from client where email like %?1%", nativeQuery = true)
    List<Client> searchByEmail(String email);
}
