package com.springwalk.sample.controller;

import com.springwalk.sample.model.MessageModel;
import com.springwalk.sample.repo.MessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class MessageController {
    @Autowired
    MessageRepository repository;

    @RequestMapping(value="/feedback", method=RequestMethod.POST, consumes = "application/json")
    public boolean addMessage(@RequestBody MessageModel message) {
        try {
            repository.save(message);
            return true; 
        } catch (Exception e) {
            return false;
        }
    }

    @RequestMapping(value="/getfeedback", method=RequestMethod.GET)
    public Iterable<MessageModel> getMessage() {
             return repository.findAll();
    }
}
