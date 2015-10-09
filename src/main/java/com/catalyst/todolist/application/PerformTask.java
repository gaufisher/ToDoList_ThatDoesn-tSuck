package com.catalyst.todolist.application;

/**
 * Created by gfisher on 10/9/2015.
 */
public interface PerformTask {
    public void setToDoDao(ToDoDao toDoDao);
    List<Item> getItems();
}
