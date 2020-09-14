package com.example.mark1.repository;

import com.example.mark1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    public Student findByLastName(String lastName);
}
