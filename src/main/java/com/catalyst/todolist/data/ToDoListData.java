package com.catalyst.todolist.data;

/**
 * Created by gfisher on 10/8/2015.
 */
public class ToDoListData implements ToDoDao {
    public List<Task> getTasks() {
        System.out.println("I got the item list");
        return null;
    }
}
