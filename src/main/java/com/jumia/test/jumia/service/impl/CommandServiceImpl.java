package com.jumia.test.jumia.service.impl;

import com.jumia.test.jumia.dao.CommandDao;
import com.jumia.test.jumia.entity.Command;
import com.jumia.test.jumia.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class CommandServiceImpl implements CommandService {

    @Autowired
    private CommandDao commandDao;

    @Override
    public Command create(Command command) {
        command.setDateTime(LocalDateTime.now());
        return commandDao.save(command);
    }

    @Override
    public Command update(Long id, Command command) throws Exception {
        Command commandToUpdate = findById(id);
        if (commandToUpdate ==  null) {
            throw new Exception("Command not found");
        }
        commandToUpdate.setProducts(command.getProducts());
        return commandDao.save(commandToUpdate);
    }

    @Override
    public Command findById(Long id) {
        return commandDao.getOne(id);
    }

    @Override
    public void delete(Long id) throws Exception {
        Command command = findById(id);
        if (command == null) {
            throw new Exception("Command not found");
        }
        commandDao.delete(command);
    }

    @Override
    public List<Command> findAll() {
        return commandDao.findAll();
    }
}
