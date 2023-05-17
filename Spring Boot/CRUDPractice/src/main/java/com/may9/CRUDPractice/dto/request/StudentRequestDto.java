package com.may9.CRUDPractice.dto.request;

public class StudentRequestDto {
    private String name;
    private Integer addressId;

    //Getteers And Stters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
//Constructor

    public StudentRequestDto(){}
    public StudentRequestDto(String name) {
        this.name = name;
    }
}
