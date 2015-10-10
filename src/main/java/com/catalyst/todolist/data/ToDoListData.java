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
        return list;
    }

    @Override
    public void addTask(Task task) {

        list.add(task);
    }

    @Override
    public void updateTask(int id, String title) {
        list.get(id).setTitle(title);
    }

    @Override
    public void removeTask(int id) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }

    @Override
    public void markTaskComplete(int id)
    {
        list.get(id).setComplete(true);
    }

    @Override
    public void markTaskIncomplete(int id) {
        list.get(id).setComplete(false);
    }

    @Override
    public ArrayList<Task> showCompleteTasks() {
        ArrayList<Task> completedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isComplete()){
                completedList.add(list.get(i));
            }
        }
        return completedList;
    }

    @Override
    public ArrayList<Task> showIncompleteTasks() {
        ArrayList<Task> incompletedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).isComplete()){
                incompletedList.add(list.get(i));
            }
        }
        return incompletedList;
    }

    @Override
    public void addDescription(int id, String description) {

    }

    @Override
    public void assignTask(int id) {

    }

    @Override
    public void markTaskInProgress(int id) {

    }

    @Override
    public ArrayList<Task> showTasksInProgress() {

        return list;
    }

    @Override
    public void assignDueDate(int id) {

    }

    @Override
    public ArrayList<Task> showPastDue() {

        return list;
    }

    @Override
    public Task getSingleTask(int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return list.get(i);
            }
        }
        return list.get(id);
    }
}
