package com.learning.demo.springbootexample.service.impl;

import com.learning.demo.springbootexample.pojo.Student;
import com.learning.demo.springbootexample.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    //Ncell SMS
    @Override
    public String giveDetails(Student std) {
        return "The student has id " +  std.getId() + "and name " + std.getName();
    }
}
