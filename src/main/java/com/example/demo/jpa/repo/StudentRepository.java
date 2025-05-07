package com.example.demo.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
