package com.catalyst.todolist.data;

import com.catalyst.todolist.entities.Description;
import com.catalyst.todolist.entities.Task;

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
    void addTask(Task task);
    void updateTask(int id, String title);
    void removeTask(int id);
    void markTaskComplete(int id);
    void markTaskIncomplete(int id);
    ArrayList<Task> showCompleteTasks();
    ArrayList<Task> showIncompleteTasks();
    void addDescription(int id, Description description);
    void assignTask(int id);
    void markTaskInProgress(int id);
    ArrayList<Task> showTasksInProgress();
    void assignDueDate(int id);
    ArrayList<Task> showPastDue();
    Task getSingleTask(int id);
    boolean validateId(int id);

}
