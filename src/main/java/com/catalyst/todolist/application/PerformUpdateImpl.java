package com.catalyst.todolist.application;

import com.catalyst.todolist.data.ToDoDao;
import com.catalyst.todolist.entities.Task;
import com.catalyst.todolist.entities.Description;
import com.catalyst.todolist.presentation.Menu;

import java.util.ArrayList;


/**
 * Created by gfisher on 10/9/2015.
 */
public class PerformUpdateImpl implements PerformUpdate {
    private ToDoDao toDoDao;
    private int counter=0;

    public void setToDoDao(ToDoDao toDoDao) {
        this.toDoDao = toDoDao;
    }

    public ArrayList<Task> getTasks() {
        return toDoDao.getTasks();
    }

    public void addTask(String title) {
        counter++;
        Task newTask = new Task(title, counter, false);
        toDoDao.addTask(newTask);

    }

    public void updateTask(int id, String title) {
        toDoDao.updateTask(id, title);
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
        toDoDao.showCompleteTasks();
    }

    public void showIncompleteTasks() {
        toDoDao.showIncompleteTasks();
    }

    public void addDescription(int id, String description) {
        toDoDao.addDescription(id, description);
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
        return toDoDao.getSingleTask(id);
    }

}
