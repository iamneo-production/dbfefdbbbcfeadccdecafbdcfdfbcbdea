package com.example;

import java.util.ArrayList;
import java.util.List;

class StudentDAOImpl implements StudentDAO {
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }
}