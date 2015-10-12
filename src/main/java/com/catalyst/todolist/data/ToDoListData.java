package com.catalyst.todolist.data;

import com.catalyst.todolist.entities.Description;
import com.catalyst.todolist.entities.Status;
import com.catalyst.todolist.entities.Task;
import com.catalyst.todolist.entities.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
        for (Task aList : list) {
            if (aList.getId() == id) {
                aList.setTitle(title);
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
        for (Task aList : list) {
            if (aList.getStatus() == Status.COMPLETE) {
                completedList.add(aList);
            }
        }
        return completedList;
    }

    @Override
    public ArrayList<Task> showIncompleteTasks() {
        ArrayList<Task> incompleteList = new ArrayList<>();
        for (Task aList : list) {
            if (aList.getStatus() == Status.INCOMPLETE) {
                incompleteList.add(aList);
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
        for (Task aList : list) {
            if (aList.getStatus() == Status.INPROGRESS) {
                inProgressList.add(aList);
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
        ArrayList<Task> pastDue = new ArrayList<>();
        for (Task aList : list) {
            if (aList.getStatus() == Status.INCOMPLETE && aList.getDueDate().isBefore(LocalDate.now())) {
                pastDue.add(aList);
            }
        }
        return pastDue;
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
        for (Task aList : list) {
            if (id == aList.getId()) {
                valid = true;
            }
        }
        return valid;
    }


    /**
     * Check to make sure a title doesn't already exist.
     *
     * @param title the title the user is checking.
     * @return a boolean on whether or not the title already exists.
     */
    @Override
    public boolean validateTitle(String title) {
        boolean exist = false;
        for (Task aList : list) {
            if (title.equalsIgnoreCase(aList.getTitle())) {
                exist = true;
            }
        }
        return exist;
    }
}
