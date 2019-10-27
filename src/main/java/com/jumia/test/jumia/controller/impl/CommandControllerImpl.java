package com.jumia.test.jumia.controller.impl;

import com.jumia.test.jumia.controller.CommandController;
import com.jumia.test.jumia.entity.Command;
import com.jumia.test.jumia.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CommandControllerImpl implements CommandController {
    @Autowired
    private CommandService CommandService;
    @Override
    public ResponseEntity<Command> create(Command command) {
        ResponseEntity<Command> CommandResponseEntity;
        try {
            CommandResponseEntity = new ResponseEntity<>(CommandService.create(command), HttpStatus.CREATED);
        } catch (Exception e) {
            CommandResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return CommandResponseEntity;

    }

    @Override
    public ResponseEntity<Command> update(Long id, Command command) {

        ResponseEntity<Command> CommandResponseEntity;
        try {
            CommandResponseEntity = new ResponseEntity<>(CommandService.update(id,command), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            CommandResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return CommandResponseEntity;
    }

    @Override
    public ResponseEntity<Command> findById(Long id) {
        ResponseEntity<Command> CommandResponseEntity;
        try {
            CommandResponseEntity = new ResponseEntity<>(CommandService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            CommandResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return CommandResponseEntity;
    }

    @Override
    public ResponseEntity<List<Command>> findAll() {

        ResponseEntity<List<Command>> CommandResponseEntity;
        try {
            CommandResponseEntity = new ResponseEntity<>(CommandService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            CommandResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return CommandResponseEntity;


    }

    @Override
    public ResponseEntity<String> delete(Long id) {

        ResponseEntity<String> CommandResponseEntity;
        try {
            CommandService.delete(id);
            CommandResponseEntity = new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            CommandResponseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return CommandResponseEntity;


    }
}
