package com.example.mark1.services;

import com.example.mark1.entity.Student;
import com.example.mark1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    StudentRepository studentRepository;

    public Student addStudentDetail(Student student){
        return studentRepository.save(student);
    }

    public List<Student> addStudentDetails(List<Student> students){
        return studentRepository.saveAll(students);
    }

    public Student getStudentDetailById(Integer id){
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getAllStudentDetails(){
        return studentRepository.findAll();
    }

    public String getStudentGradeByLastName(String lastName){
        Student studentGrade = studentRepository.findByLastName(lastName);
        return studentGrade.toString();
    }

    public void deleteStudentDetail(Integer id){
        studentRepository.deleteById(id);
    }

    public Student updateStudentDetail(Student student){
        Student studentDetail = studentRepository.findById(student.getStudentId()).orElse(null);
        studentDetail.setGpa(student.getGpa());
        return studentRepository.save(studentDetail);
    }


}
