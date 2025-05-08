package com.example.demo.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.jpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
