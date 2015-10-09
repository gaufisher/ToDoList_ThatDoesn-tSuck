package com.catalyst.todolist.application;

/**
 * Created by gfisher on 10/9/2015.
 */
public class PerformTaskImpl implements PerformTask{
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
                if(y != 0){
                    divide();
                }
                else{
                    System.out.println("You can't divide by zero!");
                }
                break;

            case "5":
                markTaskComplete();
                power();
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

}
