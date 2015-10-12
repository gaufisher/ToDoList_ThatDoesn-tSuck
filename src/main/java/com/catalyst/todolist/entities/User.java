package com.catalyst.todolist.entities;

/**
 * Created by ddelaney on 10/12/2015.
 * A user is an object that has 5 parameters. Look at the constructors to figure them out. I'm done with java docs.
 */
public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String SSN;

    /**
     * Creates a default user
     */
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.userName = "noob";
        this.password = "password1";
        this.SSN = "";
    }

    /**
     * Creates a user with name userName
     * @param userName input from user
     */
    public User(String userName) {
        this.userName = userName;
        this.firstName = "";
        this.lastName = "";
        this.password = "password1";
        this.SSN = "";
    }

    /**
     * Get the user's first name
     * @return the user's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the user's first name
     * @param firstName from user input
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the user's last name
     * @return the user's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the user's last name
     * @param lastName from user input
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the user's username
     * @return the user's username
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set the user's username
     * @param userName from input
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Get the user's password
     * @return the user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the user's password
     * @param password from user input
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get the user's Social Security Number for research purposes only
     * @return the social security number
     */
    public String getSSN() {
        return SSN;
    }

    /**
     * Set the user's social security number
     * @param SSN
     */
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return userName + ", " + password + ", " + firstName + ", " + lastName + ", " + SSN;
    }
}
