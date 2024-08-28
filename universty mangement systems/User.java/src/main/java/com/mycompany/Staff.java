/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author zmohammed
 */
/**
 * Represents a staff member with a unique ID, job title, and department.
 */
public class Staff extends Users implements StaffDetails {
    // Additional fields
    private String staffName;
    private String staffId;
    private String staffRole;

    // Constructor
    public Staff(int id, String name, String email, String staffName, String staffId, String staffRole) {
        super(id, name, email);
        this.staffName = staffName;
        this.staffId = staffId;
        this.staffRole = staffRole;
    }

    // Getters and Setters
    public String getStaffName() {
        return staffName;
    }

    public String getStaffId() {
        return staffId;
    }

    // Implementation of the StaffDetails interface
    @Override
    public String getStaffRole() {
        return staffRole;
    }

    @Override
    public void setStaffRole(String role) {
        if (role.equalsIgnoreCase("Clerk") || role.equalsIgnoreCase("Admin")) {
            this.staffRole = role;
        } else {
            throw new IllegalArgumentException("Role must be either 'Clerk' or 'Admin'");
        }
    }

    // Implementation of the abstract getDetails() method from User class
    @Override
    public String getDetails() {
        return "Staff Name: " + staffName + "\nStaff ID: " + staffId + "\nRole: " + staffRole +
               "\nEmail: " + getEmail();
    }
}
