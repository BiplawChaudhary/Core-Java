package com.may9.CRUDPractice.controller;


import com.may9.CRUDPractice.dto.request.StudentRequestDto;
import com.may9.CRUDPractice.dto.response.StudentResponseDto;
import com.may9.CRUDPractice.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/test")
    public ResponseEntity<String> testFunction() {
        return new ResponseEntity<>("Test Success", HttpStatus.OK);
    }

    @PostMapping("/en")
    @Operation(summary = "Operation to save student", description = "This is my API")
    public ResponseEntity<?> saveStudentData(@RequestBody StudentRequestDto std) {
//        System.out.println(std.getName());
        try {
            return new ResponseEntity<>(studentService.saveStudent(std), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


}
