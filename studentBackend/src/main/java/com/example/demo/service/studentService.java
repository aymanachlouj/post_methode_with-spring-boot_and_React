package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface studentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
