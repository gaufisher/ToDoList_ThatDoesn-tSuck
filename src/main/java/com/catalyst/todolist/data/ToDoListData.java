package com.catalyst.todolist.data;

import com.catalyst.todolist.entities.Task;

import java.util.ArrayList;

/**
 * Created by ddelaney on 10/8/2015.
 */
public class ToDoListData implements ToDoDao {
    private ArrayList<Task> list;


    /**
     * Use this to retrieve a list of all tasks.
     *
     * @return a List<Task> object containing all employees.
     */
    @Override
    public ArrayList<Task> getTasks() {
        return null;
    }

    @Override
    public void addTask(Task task) {
        list.add(task);
    }

    @Override
    public void displayTasks() {

    }

    @Override
    public void updateTask(int id, String title) {

    }

    @Override
    public void removeTask(int id) {

    }

    @Override
    public void markTaskComplete(int id) {

    }

    @Override
    public void markTaskIncomplete(int id) {

    }

    @Override
    public void showCompleteTasks() {

    }

    @Override
    public void showIncompleteTasks() {

    }

    @Override
    public void addDescription(int id) {

    }

    @Override
    public void assignTask(int id) {

    }

    @Override
    public void markTaskInProgress(int id) {

    }

    @Override
    public void showTasksInProgress() {

    }

    @Override
    public void assignDueDate(int id) {

    }

    @Override
    public void showPastDue() {

    }
}
