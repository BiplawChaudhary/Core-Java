package com.may9.CRUDPractice.service.impl;

import com.may9.CRUDPractice.dto.request.StudentRequestDto;
import com.may9.CRUDPractice.dto.response.StudentResponseDto;
import com.may9.CRUDPractice.entity.Address;
import com.may9.CRUDPractice.entity.Student;
import com.may9.CRUDPractice.repository.AddressRepo;
import com.may9.CRUDPractice.repository.StudentRepo;
import com.may9.CRUDPractice.service.StudentService;
import org.springframework.stereotype.Service;


@Service
//@RequiredArgs COnstrucor
public class StudentImpl implements StudentService {

    private final StudentRepo studentRepo;
    private final AddressRepo addressRepo;


    public StudentImpl(StudentRepo studentRepo, AddressRepo addressRepo) {
        this.studentRepo = studentRepo;
        this.addressRepo = addressRepo;
    }



    @Override
    public StudentResponseDto saveStudent(StudentRequestDto std) throws Exception {
        Student newStudent = new Student();

        newStudent.setName(std.getName());

//        Address address = addressRepo.getById(std.getAddressId());
        Address address = addressRepo.findById(std.getAddressId()).get();

        if(address == null){
            throw new Exception("ID Not Present");
        }

        newStudent.setAddress(address);


        Student savedStudent = studentRepo.save(newStudent);

        StudentResponseDto returnData = new StudentResponseDto(savedStudent);
        return returnData;


    }
}
