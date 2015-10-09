package com.catalyst.todolist.application;

import com.catalyst.todolist.data.ToDoDao;
import com.catalyst.todolist.entities.Task;
import com.catalyst.todolist.presentation.Menu;

import java.util.ArrayList;


/**
 * Created by gfisher on 10/9/2015.
 */
public class PerformUpdateImpl implements PerformUpdate {
    private ToDoDao toDoDao;

    public void setToDoDao(ToDoDao toDoDao) {
        this.toDoDao = toDoDao;
    }

    public ArrayList<Task> getTasks() {
        return toDoDao.getTasks();
    }

    public void addTask(String title) {
    }

    public void displayTasks() {

    }

    public void updateTask(int id String title) {

    }

    public void removeTask(int id) {
        toDoDao.removeTask(id);
    }

    public void markTaskComplete(int id) {
        toDoDao.markTaskComplete(id);
    }

    public void markTaskIncomplete(int id) {
        toDoDao.markTaskIncomplete(id);
    }

    public void showCompleteTasks() {

    }

    public void showIncompleteTasks() {

    }

    public void addDescription(int id) {

    }

    public void assignTask(int id) {

    }

    public void markTaskInProgress(int id) {

    }

    public void showTasksInProgress() {

    }

    public void assignDueDate(int id) {

    }

    public void showPastDue() {

    }

    public Task getSingleTask(int id){
        toDoDao.getSingleTask(id);
    }

}
