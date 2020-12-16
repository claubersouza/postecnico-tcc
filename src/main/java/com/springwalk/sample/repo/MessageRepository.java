package com.springwalk.sample.repo;

import org.springframework.data.repository.CrudRepository;

import com.springwalk.sample.model.MessageModel;

public interface MessageRepository extends CrudRepository<MessageModel,Long> {
    
}
