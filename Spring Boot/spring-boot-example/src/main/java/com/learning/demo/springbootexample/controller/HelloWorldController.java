package com.learning.demo.springbootexample.controller;

import com.learning.demo.springbootexample.pojo.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class HelloWorldController {
    @GetMapping("/hi")
    public String hello(){
        return "Hello World";
    }

//    Dynamic things in curly bracket {}
//    THe @PathVariable tells that the variables value is in the path
//    The method blow has a path of /get/{a} and then receives the value of a from path and then just returns it
    @GetMapping("/get/{a}")
    public Integer returnInteger(@PathVariable Integer a){
        return a;
    }

    @GetMapping("/query")
    public String returnName(@RequestParam("name") String name){
        return "Received Param: " + name;
    }




    @PostMapping("/post")
    public String returnValueSome(){
        return "POst Method";
    }

    @PostMapping("/status")
    public ResponseEntity<String> statusCheck(){
        return new ResponseEntity<>("User Defined Error", HttpStatus.ACCEPTED);
    }

    @PostMapping("/input")
    public ResponseEntity<Student> studentClass(@RequestBody Student std){
//        System.out.printf(std.getId());
//        System.out.println(std.getName());
        return new ResponseEntity<>(std, HttpStatus.OK);
    }

    @PostMapping("/file")
    public ResponseEntity<Student> formTest(@ModelAttribute Student st){
        return new ResponseEntity<>(st, HttpStatus.OK);
    }

    @PostMapping("/header")
    public  ResponseEntity<String> headerInput(@RequestHeader String header){
        return new ResponseEntity<>(header, HttpStatus.OK);
    }
}
