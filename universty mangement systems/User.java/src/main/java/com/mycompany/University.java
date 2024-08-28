/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author zmohammed
 */
import java.util.ArrayList;
import java.util.List;

public class University {
    // Fields
    private String name;
    private List<Department> departments;

    // Constructor
    public University(String name, List<Department> departments) {
        this.name = name;
        this.departments = new ArrayList<>(departments); // Initialize the list to avoid null issues
    }

    // Method to display university details
    public void displayUniversityDetails() {
        System.out.println("University: " + name);
        for (Department department : departments) {
            System.out.println(department.getDepartmentDetails()); // Print department details
        }
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return new ArrayList<>(departments); // Return a copy to maintain encapsulation
    }

    public void setDepartments(List<Department> departments) {
        this.departments = new ArrayList<>(departments); // Initialize the list to avoid null issues
    }
}
