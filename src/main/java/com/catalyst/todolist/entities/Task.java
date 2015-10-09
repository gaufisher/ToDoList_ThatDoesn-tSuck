package com.catalyst.todolist.entities;

/**
 * Created by ddelaney on 10/8/2015.
 */
public class Task {
    private String title;
    private int id;
    private boolean complete;
    private Description description;

    public Task() {
        this.title = "";
        this.id = 0;
        this.complete = false;
        this.description = null;
    }

    public Task(String title, int id, boolean isComplete) {
        this.title = title;
        this.id = id;
        this.complete = isComplete;
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

    @Override
    public String toString() {
        return this.id + ", " + this.title + ", " + this.complete;
    }
}
