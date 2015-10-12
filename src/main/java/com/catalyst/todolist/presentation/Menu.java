package com.catalyst.todolist.presentation;

import com.catalyst.todolist.application.PerformUpdate;
import com.catalyst.todolist.application.PerformUpdateImpl;
import com.catalyst.todolist.data.ToDoListData;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by cat on 10/8/2015.
 */
public class Menu {
    Scanner scanner = new Scanner(System.in);
    private PerformUpdate performUpdate;

    public void setPerformUpdate(PerformUpdate performUpdate){
        this.performUpdate = performUpdate;
    }

    public void start() {
        do {
            mainMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    performUpdate.addTask(getNewTitle());
                    break;
                case "2":
                    displayTasks(performUpdate.getTasks());
                    break;
                case "3":
                    performUpdate.updateTask(getTaskNumber(), getNewTitle());
                    break;
                case "4":
                    performUpdate.removeTask(getTaskNumber());
                    break;
                case "5":
                    performUpdate.markTaskComplete(getTaskNumber());
                    break;
                case "6":
                    performUpdate.markTaskIncomplete(getTaskNumber());
                    break;
                case "7":
                    displayTasks(performUpdate.showCompleteTasks());
                    break;
                case "8":
                    displayTasks(performUpdate.showIncompleteTasks());
                    break;
                case "9":
                    performUpdate.addDescription(getTaskNumber(), getNewDescription());
                    break;
                case "10":
                    performUpdate.assignTask(getTaskNumber());
                    break;
                case "11":
                    performUpdate.markTaskInProgress(getTaskNumber());
                    break;
                case "12":
                    performUpdate.showTasksInProgress();
                    break;
                case "13":
                    performUpdate.assignDueDate(getTaskNumber());
                    break;
                case "14":
                    performUpdate.showPastDue();
                case "15":
                    return;
                default:
                    break;
            }
            System.out.println("Press enter to continue.");
            scanner.nextLine();
        } while (true);
    }

    private void mainMenu() {
        System.out.println("To Do List");
        System.out.println("===================");
        System.out.println("1. Add task");
        System.out.println("2. Display task");
        System.out.println("3. Update task");
        System.out.println("4. Remove task");
        System.out.println("5. Mark task as complete");
        System.out.println("6. Mark task as incomplete");
        System.out.println("7. Show completed tasks");
        System.out.println("8. Show incomplete tasks");
        System.out.println("9. Add description to task");
        System.out.println("10. Assign task");
        System.out.println("11. Mark task in progress");
        System.out.println("12. Show tasks in progress");
        System.out.println("13. Assign due date");
        System.out.println("14. Show past due");
        System.out.println("15. Exit");
    }

    private void displayTasks(ArrayList taskList){
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(taskList.get(i));
        }
    }

    private int getTaskNumber() {
        int input = 0;
        boolean isTrue;
        do {
            System.out.println("Enter an id number:");
            try {
                input = Integer.parseInt(scanner.nextLine());
                isTrue = true;
            } catch (NumberFormatException e) {
                System.out.println("Not a valid input");
                isTrue = false;
            }
        } while (!isTrue);

        return input;
    }

    private String getNewTitle() {
        String input;
        do {
            System.out.println("Enter a new title:");
            input = scanner.nextLine();
            if (input.equals("") || input == null)
                System.out.println("Not a valid input");
            else
                break;
        } while (true);
        System.out.println("The title of the book will be "+ input);
        return input;
    }

    private String getNewDescription() {
        String input;
        do{
            System.out.println("Enter a description:");
            input = scanner.nextLine();
            if(input.equals("") || input == null)
                System.out.println("Not a valid input");
            else
                break;
        }while (true);
        System.out.println("The description is: "+ input);
        return input;
    }

}
