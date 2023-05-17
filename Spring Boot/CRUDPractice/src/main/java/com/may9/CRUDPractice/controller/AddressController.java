package com.may9.CRUDPractice.controller;


import com.may9.CRUDPractice.dto.request.AddressRequestDto;
import com.may9.CRUDPractice.dto.response.AddressResponseDto;
import com.may9.CRUDPractice.service.AddressService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
    //Constructor injecti0n
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/test")
    public ResponseEntity<String> justData(){
        return new ResponseEntity<>("Success Test", HttpStatus.OK);
    }

    @PostMapping("/enter")
    public ResponseEntity<AddressResponseDto> handler(@RequestBody AddressRequestDto req1){
        return new ResponseEntity<>(addressService.saveAddress(req1), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    @Operation(description = "Get all address")
    public ResponseEntity<?> getAllAddress(){
        return  new ResponseEntity<>(addressService.getAllAddress(), HttpStatus.OK);
    }

    @GetMapping("/getid/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        return new ResponseEntity<>(addressService.getAddressById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id){
        return new ResponseEntity<>(addressService.deleteAddressById(id), HttpStatus.OK);


    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAddress(@PathVariable Integer id, @RequestBody AddressRequestDto req){
        return new ResponseEntity<>(addressService.updateAddress(id,req), HttpStatus.OK);
    }

}
