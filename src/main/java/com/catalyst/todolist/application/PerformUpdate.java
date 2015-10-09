package com.catalyst.todolist.application;

import com.catalyst.todolist.data.ToDoDao;
import com.catalyst.todolist.entities.Task;

import java.util.List;

/**
 * Created by gfisher on 10/9/2015.
 */
public interface PerformUpdate {
    void setToDoDao(ToDoDao toDoDao);
    List<Task> getTasks();
}
