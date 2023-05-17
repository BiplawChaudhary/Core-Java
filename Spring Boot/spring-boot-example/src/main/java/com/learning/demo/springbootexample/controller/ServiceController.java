package com.learning.demo.springbootexample.controller;

import com.learning.demo.springbootexample.pojo.Student;
import com.learning.demo.springbootexample.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private TestService testService;

    @PostMapping("/student")
    public ResponseEntity<String> getDetails(@RequestBody Student std){
        return new ResponseEntity<>(testService.giveDetails(std), HttpStatus.ACCEPTED);
    }

}
