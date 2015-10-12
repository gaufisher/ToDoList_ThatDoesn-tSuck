package com.catalyst.todolist.presentation;

import com.catalyst.todolist.application.PerformUpdate;
import com.catalyst.todolist.application.PerformUpdateImpl;
import com.catalyst.todolist.data.ToDoListData;
import com.catalyst.todolist.entities.Description;
import com.catalyst.todolist.entities.User;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by cat on 10/8/2015.
 * Menu object runs the rest of the todo list
 */
public class Menu {
    Scanner scanner = new Scanner(System.in);
    private PerformUpdate performUpdate;

    public void setPerformUpdate(PerformUpdate performUpdate){
        this.performUpdate = performUpdate;
    }

    /**
     * This method controls the flow and grabs user input.
     */
    public void start() {
        boolean canHazMenu = false;
        do {
            if (canHazMenu)
                lolMenu();
            else
                mainMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    performUpdate.addTask(getNewTitle(), getNewDueDate(), getNewUser());
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
                    displayTasks(performUpdate.showCompleteTasks());
                    break;
                case "7":
                    performUpdate.markTaskIncomplete(getTaskNumber());
                    break;
                case "8":
                    displayTasks(performUpdate.showIncompleteTasks());
                    break;
                case "9":
                    performUpdate.markTaskInProgress(getTaskNumber());
                    break;
                case "10":
                    displayTasks(performUpdate.showTasksInProgress());
                    break;
                case "11":
                    performUpdate.addDescription(getTaskNumber(), getNewDescription());
                    break;
                case "12":
                    performUpdate.assignTask(getTaskNumber(), getNewUser());
                    break;
                case "13":
                    performUpdate.assignDueDate(getTaskNumber(), getNewDueDate());
                    break;
                case "14":
                    displayTasks(performUpdate.showPastDue());
                case "15":
                    scanner.close();
                    return;
                case "lol":
                    canHazMenu = true;
                    break;
                case "kthxbai":
                    canHazMenu = false;
                    break;
                default:
                    System.out.println("orly");
                    break;
            }
            System.out.println("Press enter to continue.");
            scanner.nextLine();
        } while (true);
    }

    /**
     * "Prints out a menu to the console because consoles are the greatest thing ever created, just ask anyone."
     * --No one EVER
     */
    private void mainMenu() {
        System.out.println("To Do List");
        System.out.println("===================");
        System.out.println("1. Add task");
        System.out.println("2. Display tasks");
        System.out.println("3. Update task");
        System.out.println("4. Remove task");
        System.out.println("5. Mark task as complete");
        System.out.println("6. Show completed tasks");
        System.out.println("7. Mark task as incomplete");
        System.out.println("8. Show incomplete tasks");
        System.out.println("9. Mark task in progress");
        System.out.println("10. Show tasks in progress");
        System.out.println("11. Add description to task");
        System.out.println("12. Assign task");
        System.out.println("13. Assign due date");
        System.out.println("14. Show past due");
        System.out.println("15. Exit");
    }

    /**
     * lol
     */
    private void lolMenu(){
        System.out.println("2 Do List");
        System.out.println("===================");
        System.out.println("1. ADD TASK");
        System.out.println("2. DISPLAY TASKZ");
        System.out.println("3. UPDATE TASK");
        System.out.println("4. REMOOV TASK");
        System.out.println("5. MARK TASK AS COMPLETE");
        System.out.println("6. SHOW COMPLETD TASKZ");
        System.out.println("7. MARK TASK AS INCOMPLETE");
        System.out.println("8. SHOW INCOMPLETE TASKZ");
        System.out.println("9. MARK TASK IN PROGRES");
        System.out.println("10. SHOW TASKZ IN PROGRES");
        System.out.println("11. ADD DESCRIPSHUN 2 TASK");
        System.out.println("12. ASSIGN TASK");
        System.out.println("13. ASSIGN DUE DATE");
        System.out.println("14. SHOW PAST DUE");
        System.out.println("15. EXIT");
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
                if(performUpdate.validateId(input)){
                    isTrue = true;
                }
                else{isTrue = false;}

            } catch (NumberFormatException e) {
                System.out.println("Not a valid input");
                isTrue = false;
            }
        }
        while (!isTrue);

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
        System.out.println("The title is: "+ input);
        return input;
    }

    private Description getNewDescription() {
        String input;
        Description description = new Description();
        do{
            System.out.println("Enter a description:");
            input = scanner.nextLine();
            if(input.equals("") || input == null)
                System.out.println("Not a valid input");
            else
                break;
        }while (true);
        System.out.println("The description is: "+ input);
        description.setDescription(input);
        return description;
    }

    private User getNewUser(){
        User user = new User();
        String input;
        do{
            System.out.println("Enter a username:");
            input = scanner.nextLine();
            if(input.equals("") || input == null)
                System.out.println("Not a valid input");
            else
                break;
        }while (true);
        user.setUserName(input);
        return user;
    }

    private LocalDate getNewDueDate() {
        DateTimeFormatter dateFormatter =  DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date;
        String input;
        do{
            try {
                System.out.println("Enter a date (MM/DD/YYYY):");
                input = scanner.nextLine();
                date = LocalDate.parse(input, dateFormatter);
                break;
            }
           catch(DateTimeParseException e) {
               System.out.println("Not a valid input");
           }
        }while (true);
        return date;
    }

}
