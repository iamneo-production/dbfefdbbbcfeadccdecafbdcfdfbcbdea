package com.example;

import java.util.List;

interface StudentDAO {
    void addStudent(Student student);

    List<Student> getAllStudents();
}