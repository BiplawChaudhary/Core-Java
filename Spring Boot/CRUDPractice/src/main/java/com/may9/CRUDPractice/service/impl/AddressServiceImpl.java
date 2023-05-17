package com.may9.CRUDPractice.service.impl;

import com.may9.CRUDPractice.dto.request.AddressRequestDto;
import com.may9.CRUDPractice.dto.response.AddressResponseDto;
import com.may9.CRUDPractice.entity.Address;
import com.may9.CRUDPractice.repository.AddressRepo;
import com.may9.CRUDPractice.service.AddressService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepo addressRepo;

    public AddressServiceImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }


    @Override
    public AddressResponseDto saveAddress(AddressRequestDto address) {
        Address add1 = new Address();

        add1.setState(address.getState());
        add1.setDistrict(address.getDistrict());

        Address savedAddress = addressRepo.save(add1);

        AddressResponseDto returnData = new AddressResponseDto(savedAddress);
        return returnData;

    }

    @Override
    public List<AddressResponseDto> getAllAddress() {
        List<AddressResponseDto> returnList = new ArrayList<>();
        List<Address> addressList = addressRepo.findAll();

        for(Address address: addressList){
            AddressResponseDto addressResponseDto = new AddressResponseDto(address);
            returnList.add(addressResponseDto);
        }
        return returnList;
    }

    @Override
    public AddressResponseDto getAddressById(Integer id) {
        Address address = addressRepo.getById(id);
        return new AddressResponseDto(address);
    }

    @Override
    @Transactional
    public Integer deleteAddressById(Integer id) {
        addressRepo.deleteById(id);
        return id;
    }

    @Override
    public AddressResponseDto updateAddress(Integer id, AddressRequestDto dto) {
        Address address = addressRepo.getById(id);
        address.setDistrict(dto.getDistrict());
        address.setState(dto.getState());
        Address updatedAddress = addressRepo.save(address);

        AddressResponseDto returnData = new AddressResponseDto(updatedAddress);
        return  returnData;
    }
}
