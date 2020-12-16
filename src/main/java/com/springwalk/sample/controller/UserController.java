package com.springwalk.sample.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.springwalk.sample.model.UserModel;
import com.springwalk.sample.repo.UserRepository;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class UserController {
    @Autowired
    UserRepository repository;

    
    @RequestMapping(value="/checkUser", method=RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE,"application/x-www-form-urlencoded"}, 
    produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, Object>  checkUser(@RequestBody JsonNode jsonData) {
        List<UserModel> userFind = repository.findByUsuarioAndSenha(jsonData.get("usuario").asText(), jsonData.get("senha").asText()); 
        if (!userFind.isEmpty()) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("resultado", "true");
            return map;
        }

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("resultado", "false");
        return map;
    }

    @RequestMapping(value="/user", method=RequestMethod.POST)
    public boolean addUser(@RequestBody UserModel user) {
        try {
            repository.save(user);   
            return true; 
        } catch (Exception e) {
            return false;
        }
        
    }
    
}
