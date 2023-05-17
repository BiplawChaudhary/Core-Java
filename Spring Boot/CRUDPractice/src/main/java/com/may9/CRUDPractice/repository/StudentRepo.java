package com.may9.CRUDPractice.repository;

import com.may9.CRUDPractice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
