package com.catalyst.todolist.data;

import com.catalyst.todolist.entities.Description;
import com.catalyst.todolist.entities.Task;
import com.catalyst.todolist.entities.User;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by cat on 10/8/2015.
 */
public interface ToDoDao {

    /**
     * Use this to retrieve a list of all tasks.
     * @return a List<Task> object containing all employees.
     */
    ArrayList<Task> getTasks();

    /**
     * Use this to add a new task to the To Do List.
     * @param task pass in a task object
     */
    void addTask(Task task);

    /**
     * Use this to change the name of an existing task
     * @param id id of task
     * @param title new title
     */
    void updateTask(int id, String title);

    /**
     * Use this to remove an existing task from the To Do List
     * @param id id of task
     */
    void removeTask(int id);

    /**
     * Use this to mark a task as complete
     * @param id id of task
     */
    void markTaskComplete(int id);

    /**
     * Use this to mark a task as incomplete
     * @param id id of task
     */
    void markTaskIncomplete(int id);

    /**
     * Use this to grab an array list of tasks that are completed
     * @return ArrayList<Task> of all the complete tasks
     */
    ArrayList<Task> showCompleteTasks();

    /**
     * Use this to grab an array list of tasks that are incomplete
     * @return ArrayList<Task> of all the incomplete tasks
     */
    ArrayList<Task> showIncompleteTasks();

    /**
     * Use this to add or update a description of a Task
     * @param id id of task
     * @param description description object that will be added to the task
     */
    void addDescription(int id, Description description);

    /**
     * Use this to assign a task to a user
     * @param id id of task you want to assign
     * @param user user you want to assign a task to
     */
    void assignTask(int id, User user);

    /**
     * Use this to change the status of a task to "In Progress"
     * @param id id of task you want to change
     */
    void markTaskInProgress(int id);

    /**
     * Use this to return a list of all tasks that are in progress
     * @return ArrayList<Task>
     */
    ArrayList<Task> showTasksInProgress();

    /**
     * Changes the due date of an existing task
     * @param id from user input
     * @param newDueDate from user input
     */
    void assignDueDate(int id, LocalDate newDueDate);

    /**
     * use this to return a list of all tasks that are past due
     * @return ArrayList<Task>
     */
    ArrayList<Task> showPastDue();

    /**
     * use this to access a single task that you want to modify
     * @param id id of the task you want to change
     * @return
     */
    Task getSingleTask(int id);

    /**
     * This will be unnecessary on an actual application. For now it ensures the id that is entered exists in the list.
     * @param id id entered by user.
     * @return a boolean on whether or not the id exists.
     */
    boolean validateId(int id);

}
