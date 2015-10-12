package com.catalyst.todolist.application;

import com.catalyst.todolist.data.ToDoDao;
import com.catalyst.todolist.entities.Status;
import com.catalyst.todolist.entities.Task;
import com.catalyst.todolist.entities.Description;
import com.catalyst.todolist.entities.User;

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
        Task newTask = new Task(title, counter, Status.INCOMPLETE);
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

    public ArrayList<Task> showCompleteTasks() {
        return toDoDao.showCompleteTasks();
    }

    public ArrayList<Task> showIncompleteTasks() {
        return toDoDao.showIncompleteTasks();
    }

    public void addDescription(int id, Description description) {
        toDoDao.addDescription(id, description);
    }

    public void assignTask(int id, User user) {
        toDoDao.assignTask(id, user);
    }

    public void markTaskInProgress(int id) {

    }

    public ArrayList<Task> showTasksInProgress() {
        return toDoDao.showTasksInProgress();
    }

    public void assignDueDate(int id) {

    }

    public ArrayList<Task> showPastDue() {
        return toDoDao.showPastDue();
    }

    public Task getSingleTask(int id){
        return toDoDao.getSingleTask(id);
    }

    public boolean validateId(int id){
        return toDoDao.validateId(id);
    }

}
