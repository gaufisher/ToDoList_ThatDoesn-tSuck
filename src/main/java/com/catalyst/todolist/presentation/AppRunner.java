package com.catalyst.todolist.presentation;
import com.catalyst.todolist.entities.Description;
import com.catalyst.todolist.entities.Task;
import com.catalyst.todolist.data.ToDoDao;
import com.catalyst.todolist.data.ToDoListData;
import com.catalyst.todolist.application.PerformUpdate;
import com.catalyst.todolist.application.PerformUpdateImpl;

/**
 * Created by Gregory on 10/10/2015.
 */
public class AppRunner {
    public static void main (String[] args){
        Menu menu = new Menu();
        menu.start();
    }
}
