package com.catalyst.todolist.application;

import com.catalyst.todolist.data.ToDoDao;
import com.catalyst.todolist.entities.Task;

/**
 * Created by gfisher on 10/9/2015.
 */
public class PerformUpdateImpl implements PerformUpdate {
    public void run(String menuNumber){
        switch(menuNumber){
            case "1":
                addTask();
                break;

            case "2":
                displayTasks();
                break;

            case "3":
                updateTask();
                break;

            case "4":
                removeTask();
                break;

            case "5":
                markTaskComplete();
                break;

            case "6":
                markTaskIncomplete();
                break;

            case "7":
                showCompleteTasks();
                break;

            case "8":
                showIncompleteTasks();
                break;

            case "9":
                addDescription();
                break;

            case "10":
                assignTask();
                break;

            case "11":
                markTaskInProgress();
                break;

            case "12":
                showTasksInProgress();
                break;

            case "13":
                assignDueDate();
                break;

            case "14":
                showIncompleteTasks();
                break;

            default:
                menu();
                break;
        }
    }

    public void addTask(){
        takeInput();
        //  takeInput() should return the task to add, combined with any other fields a task needs to have.
        //  append the input task to the existing to do list
    }

    public void displayTasks(){
        getTasks();
    }

    public void setToDoDao(ToDoDao toDoDao) {

    }

    public List<Task> getTasks() {
        return null;
    }
}
