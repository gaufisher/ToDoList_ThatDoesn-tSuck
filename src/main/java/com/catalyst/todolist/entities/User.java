package com.catalyst.todolist.entities;

/**
 * Created by ddelaney on 10/12/2015.
 */
public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String SSN;

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.userName = "noob";
        this.password = "password1";
        this.SSN = "";
    }

    public User(String userName) {
        this.userName = userName;
        this.firstName = "";
        this.lastName = "";
        this.password = "password1";
        this.SSN = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return userName + ", " + password + ", " + firstName + ", " + lastName + ", " + SSN;
    }
}
