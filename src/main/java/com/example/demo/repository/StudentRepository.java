package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.framework.sterotype.repository;

import com.example.demo.entity.Student;

@repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    
    }