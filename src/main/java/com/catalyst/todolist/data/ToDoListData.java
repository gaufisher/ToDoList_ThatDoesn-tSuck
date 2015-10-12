package com.catalyst.todolist.data;

import com.catalyst.todolist.entities.Description;
import com.catalyst.todolist.entities.Status;
import com.catalyst.todolist.entities.Task;
import com.catalyst.todolist.entities.User;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by ddelaney on 10/8/2015.
 */
public class ToDoListData implements ToDoDao {
    private ArrayList<Task> list = new ArrayList<>();

    @Override
    public ArrayList<Task> getTasks() {
        return list;
    }

    @Override
    public void addTask(Task task) {

        list.add(task);
    }

    @Override
    public void updateTask(int id, String title) {
        for(int i=0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.get(i).setTitle(title);
            }
        }
    }

    @Override
    public void removeTask(int id) {
                list.remove(getSingleTask(id));
    }

    @Override
    public void markTaskComplete(int id) {
        getSingleTask(id).setStatus(Status.COMPLETE);
    }

    @Override
    public void markTaskIncomplete(int id) {
        getSingleTask(id).setStatus(Status.INCOMPLETE);
    }

    @Override
    public ArrayList<Task> showCompleteTasks() {
        ArrayList<Task> completedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStatus() == Status.COMPLETE){
                completedList.add(list.get(i));
            }
        }
        return completedList;
    }

    @Override
    public ArrayList<Task> showIncompleteTasks() {
        ArrayList<Task> incompleteList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStatus() == Status.INCOMPLETE){
                incompleteList.add(list.get(i));
            }
        }
        return incompleteList;
    }

    @Override
    public void addDescription(int id, Description description) {
        getSingleTask(id).setDescription(description);
    }


    @Override
    public void assignTask(int id, User user) {
        getSingleTask(id).setUser(user);
    }

    @Override
    public void markTaskInProgress(int id) {
        getSingleTask(id).setStatus(Status.INPROGRESS);
    }

    @Override
    public ArrayList<Task> showTasksInProgress() {
        ArrayList<Task> inProgressList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStatus() == Status.INPROGRESS){
                inProgressList.add(list.get(i));
            }
        }
        return inProgressList;
    }

    @Override
    public void assignDueDate(int id, LocalDate newDueDate) {
        getSingleTask(id).setDueDate(newDueDate);
    }

    @Override
    public ArrayList<Task> showPastDue() {

        return list;
    }

    @Override
    public Task getSingleTask(int id){
        for (Task aList : list) {
            if (aList.getId() == id) {
                return aList;
            }
        }
        return null;
    }

    @Override
    public boolean validateId(int id){
        boolean valid = false;
        for (int i=0; i < list.size(); i++){
            if(id == list.get(i).getId()){
                valid = true;
            }
        }
        return valid;
    }

}
