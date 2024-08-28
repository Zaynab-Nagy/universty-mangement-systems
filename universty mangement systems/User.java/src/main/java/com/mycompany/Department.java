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

/**
 * Represents a department with a name, a list of courses, and a list of users.
 */
public class Department {
    // Fields (Encapsulated using private access modifier)
    private String name;
    private List<Course> courses;
    private List<Users> users;

    /**
     * Constructor for Department.
     * 
     * @param name The name of the department.
     */
    public Department(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    /**
     * Gets the name of the department.
     * 
     * @return The name of the department.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the department.
     * 
     * @param name The new name of the department.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Adds a course to the department.
     * 
     * @param course The course to be added.
     */
    public void addCourse(Course course) {
        courses.add(course);
    }

    /**
     * Gets the list of courses offered by the department.
     * 
     * @return A list of courses.
     */
    public List<Course> getCourses() {
        return new ArrayList<>(courses); // Return a copy to maintain encapsulation
    }

    /**
     * Adds a user to the department.
     * 
     * @param user The user to be added.
     */
    public void addUser(Users user) {
        users.add(user);
    }

    /**
     * Gets the list of users in the department.
     * 
     * @return A list of users.
     */
    public List<Users> getUsers() {
        return new ArrayList<>(users); // Return a copy to maintain encapsulation
    }

    /**
     * Returns the details of the department including courses and users.
     * 
     * @return A string containing the department details.
     */
    public String getDepartmentDetails() {
        StringBuilder details = new StringBuilder("Department: " + name + "\nCourses Offered:\n");
        for (Course course : courses) {
            details.append("- ").append(course.getCourseName()).append(" (").append(course.getCourseCode()).append(")\n");
        }
        details.append("Users:\n");
        for (Users user : users) {
            details.append("- ").append(user.getName()).append(" (").append(user.getClass().getSimpleName()).append(")\n");
        }
        return details.toString();
    }
}

