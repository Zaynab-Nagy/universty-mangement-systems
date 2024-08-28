/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany;

/**
 *
 * @author zmohammed
 */
public abstract class Users {
    // Fields
    private int id;
    private String name;
    private String email;

    // Constructor
    public Users(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Abstract method to get user details
    public abstract String getDetails();
}
