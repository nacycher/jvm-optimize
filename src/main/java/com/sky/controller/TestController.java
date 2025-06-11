package com.sky.controller;

import com.sky.entity.People;
import com.sky.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private PeopleMapper peopleMapper;

    @GetMapping("/add")
    public String add() {
        People people = People.initPeople();
        peopleMapper.insert(people);
        return "success";
    }

    @GetMapping("/select/{id}")
    public People add(@PathVariable("id") Long id) {
        return peopleMapper.selectById(id);
    }
}
