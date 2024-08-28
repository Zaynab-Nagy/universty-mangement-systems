/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.List;

/**
 *
 * @author zmohammed
 */
public class Professor extends Users {
    // Additional fields
    private final String department;
    private final List<String> coursesTaught;

    // Constructor
    public Professor(int id, String name, String email, String department, List<String> coursesTaught) {
        super(id, name, email);
        this.department = department;
        this.coursesTaught = coursesTaught;
    }

    // Getters
    public String getDepartment() {
        return department;
    }

    public List<String> getCoursesTaught() {
        return coursesTaught;
    }

    // Implementation of getDetails() method
    @Override
    public String getDetails() {
        return "Professor Name: " + getName() + "\nEmail: " + getEmail() + "\nDepartment: " + department +
               "\nCourses Taught: " + String.join(", ", coursesTaught);
    }
}
