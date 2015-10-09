package com.catalyst.todolist.application;

import com.catalyst.todolist.data.ToDoDao;
import com.catalyst.todolist.entities.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gfisher on 10/9/2015.
 */
public interface PerformUpdate {
    public void setToDoDao(ToDoDao toDoDao);
    ArrayList<Task> getTasks();
    void addTask();
    void displayTasks();
    void updateTask(int id, String title);
    void removeTask(int id);
    void markTaskComplete(int id);
    void markTaskIncomplete(int id);
    void showCompleteTasks();
    void showIncompleteTasks();
    void addDescription(int id);
    void assignTask(int id);
    void markTaskInProgress(int id);
    void showTasksInProgress();
    void assignDueDate(int id);
    void showPastDue();
}
