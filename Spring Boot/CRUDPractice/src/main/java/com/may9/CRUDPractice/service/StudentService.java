package com.may9.CRUDPractice.service;

import com.may9.CRUDPractice.dto.request.StudentRequestDto;
import com.may9.CRUDPractice.dto.response.StudentResponseDto;

public interface StudentService {
    StudentResponseDto saveStudent(StudentRequestDto std) throws Exception;
}
