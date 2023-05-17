package com.may9.CRUDPractice.service;

import com.may9.CRUDPractice.dto.request.AddressRequestDto;
import com.may9.CRUDPractice.dto.response.AddressResponseDto;

import java.util.List;

public interface AddressService {
    AddressResponseDto saveAddress(AddressRequestDto address);
    List<AddressResponseDto> getAllAddress();

    AddressResponseDto getAddressById(Integer id);

    Integer deleteAddressById(Integer id);

    AddressResponseDto updateAddress(Integer id, AddressRequestDto dto);
}
