package com.catalyst.todolist.entities;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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


    public Task(String title, int id, Status status,LocalDate date, User user) {
        this.title = title;
        this.id = id;
        this.status = status;
        this.dueDate = date;
        this.user = user;
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
        return id + ", " + title + ", " + status + ", " + dueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) + ", " + user.getUserName() + ", " + description;
    }
}
