package com.catalyst.todolist.presentation;

/**
 * Created by cat on 10/8/2015.
 */
public class Menu {
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
                showPastDue();
                break;

            default:
                menu();
                break;
        }
    }
}
