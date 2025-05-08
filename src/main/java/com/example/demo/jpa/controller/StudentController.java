package com.example.demo.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.entity.Student;
import com.example.demo.jpa.repo.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable long id) {
        return studentRepository.findById(id).get();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable long id, @RequestBody Student studentDetails) {
        Student student = studentRepository.findById(id).get();

        student.setName(studentDetails.getName());
        student.setTestScore(studentDetails.getTestScore());
        studentRepository.save(student);
        
        return student;
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentRepository.deleteById(id);
    }
}
