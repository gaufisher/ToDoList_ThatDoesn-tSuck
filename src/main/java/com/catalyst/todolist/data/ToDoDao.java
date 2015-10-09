package com.catalyst.todolist.data;

import com.catalyst.todolist.entities.Task;

import java.util.ArrayList;

/**
 * Created by cat on 10/8/2015.
 */
public interface ToDoDao {

    /**
     * Use this to retrieve a list of all tasks.
     * @return a List<Task> object containing all employees.
     */
    ArrayList<Task> getList();

    /**
     * Use this to set or save a list.
     * @param list
     */
    void setLists(ArrayList<Task> list);
}
