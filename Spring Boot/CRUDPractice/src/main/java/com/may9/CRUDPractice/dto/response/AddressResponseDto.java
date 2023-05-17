package com.may9.CRUDPractice.dto.response;

import com.may9.CRUDPractice.entity.Address;

public class AddressResponseDto {
    private Integer id;
    private  String state;
    private String district;

    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    //Constructor

    public AddressResponseDto(Integer id, String state, String district) {
        this.id = id;
        this.state = state;
        this.district = district;
    }
    public AddressResponseDto(Address address){
        this.id = address.getId();
        this.state = address.getState();
        this.district = address.getDistrict();
    }
}
