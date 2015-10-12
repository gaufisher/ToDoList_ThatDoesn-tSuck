package com.catalyst.todolist.application;

import com.catalyst.todolist.data.ToDoDao;
import com.catalyst.todolist.entities.Description;
import com.catalyst.todolist.entities.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gfisher on 10/9/2015.
 */
public interface PerformUpdate {
    public void setToDoDao(ToDoDao toDoDao);
    ArrayList<Task> getTasks();
    void addTask(String title);
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
}
