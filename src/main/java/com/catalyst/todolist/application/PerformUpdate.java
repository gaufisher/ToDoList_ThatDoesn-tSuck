package com.catalyst.todolist.application;

import com.catalyst.todolist.data.ToDoDao;
import com.catalyst.todolist.entities.Description;
import com.catalyst.todolist.entities.Task;
import com.catalyst.todolist.entities.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gfisher on 10/9/2015.
 */
public interface PerformUpdate {
    /**
     * Use this to set a dao
     * @param toDoDao the name of your dao
     */
    void setToDoDao(ToDoDao toDoDao);

    /**
     * Use this to grab a to do list
     * @return array list of tasks
     */
    ArrayList<Task> getTasks();

    /**
     * Adds a task to the to do list
     * @param title title from user input
     * @param newDueDate from user input
     * @param newUser from user input
     */
    void addTask(String title, LocalDate newDueDate, User newUser);

    /**
     * Updates an existing task
     * @param id from user input
     * @param title from user input
     */
    void updateTask(int id, String title);

    /**
     * Removes an existing task
     * @param id from user input
     */
    void removeTask(int id);

    /**
     * Changes the status of a task to "complete"
     * @param id from user input
     */
    void markTaskComplete(int id);

    /**
     * Changes the status of a task to "incomplete"
     * @param id from user input
     */
    void markTaskIncomplete(int id);

    /**
     * Gets an array list of all completed tasks
     * @return array list of completed tasks
     */
    ArrayList<Task> showCompleteTasks();

    /**
     * gets an array list of all incomplete tasks
     * @return array list of incomplete tasks
     */
    ArrayList<Task> showIncompleteTasks();

    /**
     * Changes the description of a task
     * @param id from user input
     * @param description from user input
     */
    void addDescription(int id, Description description);

    /**
     * Assigns a task to a user
     * @param id from user input
     * @param user from user input
     */
    void assignTask(int id, User user);

    /**
     * Changes the status of a task to In Progress
     * @param id from user input
     */
    void markTaskInProgress(int id);

    /**
     * Gets an array list of tasks that are in progress
     * @return array list of tasks that are in progress
     */
    ArrayList<Task> showTasksInProgress();
    /**
     * Assigns a due-date to a task
     * @param id from user input
     * @param newDueDate from user input
      */
    void assignDueDate(int id, LocalDate newDueDate);


    /**
     * Gets an array list of tasks that are past-due
     * @return array list of tasks that are past-due
     */
    ArrayList<Task> showPastDue();

    /**
     * Checks the existence of an id
     * @param id from user input
     * @return boolean on whether or not the id exists
     */
    boolean validateId(int id);
}
