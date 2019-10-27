package com.jumia.test.jumia.service;

import com.jumia.test.jumia.entity.Command;

import java.util.List;

public interface CommandService {
    Command create(Command command);

    Command update(Long id, Command command) throws Exception;

    Command findById(Long id);

    void delete(Long id) throws Exception;

    List<Command> findAll();
}
