package com.may9.CRUDPractice.dto.response;

import com.may9.CRUDPractice.entity.Student;

public class StudentResponseDto {
    private Integer id;
    private String name;

    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Constructor

    public StudentResponseDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentResponseDto(Student std){
        this.id = std.getId();
        this.name = std.getName();
    }
}
