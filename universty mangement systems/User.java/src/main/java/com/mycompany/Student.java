/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author zmohammed
 */
import java.util.List;

public class Student extends Users {
    // Additional fields
    private String studentId;
    private List<String> courses;

    // Constructor
    public Student(int id, String name, String email, String studentId, List<String> courses) {
        super(id, name, email);
        this.studentId = studentId;
        this.courses = courses;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public List<String> getCourses() {
        return courses;
    }

    // Implementation of getDetails() method
    @Override
    public String getDetails() {
        return "Student ID: " + studentId + "\nName: " + getName() + "\nEmail: " + getEmail() +
               "\nCourses: " + String.join(", ", courses);
    }
}

