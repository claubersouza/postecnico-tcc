package com.springwalk.sample.controller;

import com.springwalk.sample.model.SegmentModel;
import com.springwalk.sample.repo.SegmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SegmentController {
    @Autowired
    SegmentRepository repository;

    @RequestMapping(value="/segment", method=RequestMethod.POST, consumes = "application/json")
    public boolean addSegment(@RequestBody SegmentModel segment) {
        try {
            repository.save(segment);
            return true;   
        } catch (Exception e) {
            return false;
        }
    }

    @RequestMapping(value="/segment", method=RequestMethod.GET, consumes = "application/json")
    public Iterable<SegmentModel> getSegment() {
        return repository.findAll();
    }
}
