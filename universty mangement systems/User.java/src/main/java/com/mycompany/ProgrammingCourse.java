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
 * Represents a programming course with a name, code, professor, and list of enrolled students.
 */
public class ProgrammingCourse extends Course {
    // Fields specific to ProgrammingCourse
    private Professor professor;
    private List<Student> enrolledStudents;

    /**
     * Constructor for ProgrammingCourse.
     * 
     * @param courseName The name of the course.
     * @param courseCode The code of the course.
     */
    public ProgrammingCourse(String courseName, String courseCode) {
        super(courseName, courseCode); // Call the superclass constructor
        this.enrolledStudents = new ArrayList<>();
    }

    /**
     * Assigns a professor to the course.
     * 
     * @param professor The professor to be assigned.
     */
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * Enrolls a student in the course.
     * 
     * @param student The student to be enrolled.
     */
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    /**
     * Returns the details of the course including the professor and enrolled students.
     * 
     * @return A string containing the course details.
     */
    @Override
    public String getCourseDetails() {
        StringBuilder details = new StringBuilder(super.getCourseDetails()); // Call superclass method
        details.append("Professor: ").append(professor != null ? professor.getName() : "None assigned").append("\n");
        details.append("Enrolled Students: \n");
        for (Student student : enrolledStudents) {
            details.append("- ").append(student.getName()).append(" (").append(student.getStudentId()).append(")\n");
        }
        return details.toString();
    }

    /**
     * Gets the professor assigned to the course.
     * 
     * @return The professor assigned to the course.
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * Gets the list of students enrolled in the course.
     * 
     * @return A list of enrolled students.
     */
    public List<Student> getEnrolledStudents() {
        return new ArrayList<>(enrolledStudents); // Return a copy to maintain encapsulation
    }
}
