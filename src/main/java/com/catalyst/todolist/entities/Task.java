package com.catalyst.todolist.entities;

import java.time.LocalDate;

/**
 * Created by ddelaney on 10/8/2015.
 */
public class Task {
    private String title;
    private int id;
    private Status status;
    private LocalDate dueDate;
    private User user;
    private Description description;

    public Task() {
        this.title = "";
        this.id = 0;
        this.status = Status.INCOMPLETE;
        this.dueDate = null;
        this.user = new User();
        this.description = new Description();
    }


    public Task(String title, int id, Status status) {
        this.title = title;
        this.id = id;
        this.status = Status.INCOMPLETE;
        this.dueDate = null;
        this.user = new User();
        this.description = new Description();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return title + ", " + id + ", " + status + ", " + dueDate + ", " + user.getUserName() + ", " + description;
    }
}
