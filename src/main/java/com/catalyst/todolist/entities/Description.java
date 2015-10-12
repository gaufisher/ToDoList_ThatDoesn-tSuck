package com.catalyst.todolist.entities;

/**
 * Created by ddelaney on 10/8/2015.
 */
public class Description {
    private String description;

    public Description() {
        description = "No Description";
    }

    public Description(String description) {
        this.description = this.description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
