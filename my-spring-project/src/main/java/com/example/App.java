package com.example;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class App {

    public static void main(String[] args) {
        // Initialize the Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        // Get the StudentDAO bean
        StudentDAO studentDAO = context.getBean(StudentDAO.class);

        // Add sample students
        studentDAO.addStudent(new Student(1, "Alice"));
        studentDAO.addStudent(new Student(2, "Bob"));

        // Retrieve and print all students
        List<Student> students = studentDAO.getAllStudents();
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
        }

        // Close the Spring context
        context.close();
    }

    @Bean
    public StudentDAO studentDAO() {
        return new StudentDAOImpl();
    }
}