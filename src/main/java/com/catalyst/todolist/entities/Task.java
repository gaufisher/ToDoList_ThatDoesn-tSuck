package com.catalyst.todolist.entities;

/**
 * Created by ddelaney on 10/8/2015.
 */
public class Task {
    private String task;
    private int id;
    private boolean complete;
    private Description description;

    public Task() {
    }

    public Task(String task, int id, boolean isComplete) {
        this.task = task;
        this.id = id;
        this.complete = isComplete;
        this.description = new Description();
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}
