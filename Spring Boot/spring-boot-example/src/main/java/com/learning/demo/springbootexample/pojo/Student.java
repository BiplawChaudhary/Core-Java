//pojo stands for Plain Old JavaScript Object
package com.learning.demo.springbootexample.pojo;

public class Student {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer id, String name){
        this.id = id;
        this.name = name;
    }
}
