package com.jumia.test.jumia.dao;

import com.jumia.test.jumia.entity.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandDao extends JpaRepository<Command, Long> {
}
