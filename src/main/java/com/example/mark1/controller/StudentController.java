package com.example.mark1.controller;

import com.example.mark1.entity.Student;
import com.example.mark1.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentServices studentServices;

    @PostMapping("/addStudentDetail")
    public Student addStudentDetail(Student student){
        return studentServices.addStudentDetail(student);
    }

    @PostMapping("/addStudentDetails")
    public List<Student> addStudentDetails(List<Student> students){
        return studentServices.addStudentDetails(students);
    }

    @GetMapping("/findAllStudents")
    public List<Student> getAllStudentDetails(){
        return studentServices.getAllStudentDetails();
    }

    @GetMapping("/findStudentById/{Id}")
    public Student getStudentDetailsById(@PathVariable Integer id){
        return studentServices.getStudentDetailById(id);
    }

    @PutMapping("/update")
    public Student updateStudentDetail(@RequestBody Student student){
        return studentServices.updateStudentDetail(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudentById(@PathVariable  Integer id){
        studentServices.deleteStudentDetail(id);
    }




}
