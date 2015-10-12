package com.catalyst.todolist.data;

import com.catalyst.todolist.entities.Description;
import com.catalyst.todolist.entities.Task;

import java.util.ArrayList;

/**
 * Created by ddelaney on 10/8/2015.
 */
public class ToDoListData implements ToDoDao {
    private ArrayList<Task> list = new ArrayList<>();


    /**
     * Use this to retrieve a list of all tasks.
     *
     * @return a List<Task> object containing all tasks.
     */
    @Override
    public ArrayList<Task> getTasks() {
        return list;
    }


    /**
     * Use this to add a new task to the To Do List.
     * @return void
     */
    @Override
    public void addTask(Task task) {

        list.add(task);
    }


    /**
     * Use this to change the name of an existing task
     * @return void
     */
    @Override
    public void updateTask(int id, String title) {
        for(int i=0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.get(i).setTitle(title);
            }
        }
    }


    /**
     * Use this to remove an existing task from the To Do List
     * @return void
     */
    @Override
    public void removeTask(int id) {
                list.remove(getSingleTask(id));
    }

    /**
     * Use this to mark a task as complete
     * @return void
     */
    @Override
    public void markTaskComplete(int id)
    {
        getSingleTask(id).setComplete(true);
    }

    /**
     * Use this to mark a task as incomplete
     * @return void
     */
    @Override
    public void markTaskIncomplete(int id) {
        getSingleTask(id).setComplete(false);
    }


    /**
     * Use this to show a list of only tasks that are completed
     * I should probably be returning the completedList ArrayList to my presentation layer so it can present the list
     * @return void because displayTasks() prints to the console.
     */
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

    /**
     * Use this to show a list of only tasks that are incomplete
     * Same story as showCompleteTasks()...I may have to move the output to the presentation layer.
     * @return void because reasons.
     */
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

    /**
     * Use this to add or update a description of a Task
     * @return void
     */
    @Override
    public void addDescription(int id, String description) {
        list.get(id).setDescription(new Description(description));
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

    /**
     * Use this when you need to select a single Task object from the To Do List
     * @return a Task object
     */
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
