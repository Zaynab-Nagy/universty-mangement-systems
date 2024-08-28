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

// Assuming the necessary classes (University, Department, Course, User, Professor, Student) are defined elsewhere

public class Main {
    public static void main(String[] args) {
        // Create Users
        Professor professor = new Professor(1, "Dr. Smith", "smith@university.edu", "Computer Science", List.of("Java Programming"));
        Student student1 = new Student(2, "Alice", "alice@student.university.edu", "S12345", List.of("Java Programming"));
        Student student2 = new Student(3, "Bob", "bob@student.university.edu", "S12346", List.of("Java Programming"));

        // Create Courses
        ProgrammingCourse javaCourse = new ProgrammingCourse("Java Programming", "CS101");
        ProgrammingCourse dataStructures = new ProgrammingCourse("Data Structures", "CS102");

        // Create Departments
        Department csDepartment = new Department("Computer Science");
     //   csDepartment.addCourse(javaCourse);
      //  csDepartment.addCourse(dataStructures);
        csDepartment.addUser(professor);
        csDepartment.addUser(student1);
        csDepartment.addUser(student2);

        Department mathDepartment = new Department("Mathematics");
        // Optionally add courses and users to the Math department

        // Create a list of departments
        List<Department> departments = new ArrayList<>();
        departments.add(csDepartment);
        departments.add(mathDepartment);

        // Create a University and add departments
        University university = new University("My University", departments);

        // Display university details
        university.displayUniversityDetails();
    }
}
