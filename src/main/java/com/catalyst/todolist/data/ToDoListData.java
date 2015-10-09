package com.catalyst.todolist.data;

import com.catalyst.todolist.entities.Task;

import java.util.ArrayList;

/**
 * Created by ddelaney on 10/8/2015.
 */
public class ToDoListData implements ToDoDao {
    ArrayList<Task> list;

    public ArrayList<Task> getList() {

        return list;
    }

    public void setLists(ArrayList<Task> list) {

    }
}
