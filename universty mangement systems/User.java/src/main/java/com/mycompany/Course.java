/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

public class Course {
    private String courseName;
    private String courseCode;

    // Constructor
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Method to get course details
    public String getCourseDetails() {
        return "Course Name: " + courseName + "\nCourse Code: " + courseCode;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
