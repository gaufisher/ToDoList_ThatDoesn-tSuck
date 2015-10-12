package com.catalyst.todolist.entities;

/**
 * Created by ddelaney on 10/8/2015.
 */
public class Description {
    private String description;

    /**
     *Description has a default of "no description"
     */
    public Description() {
        description = "No Description";
    }

    /**
     * Creates a new description object
     * @param description user input
     */
    public Description(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Changes teh description to the user-defined description
     * @param description user input
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
