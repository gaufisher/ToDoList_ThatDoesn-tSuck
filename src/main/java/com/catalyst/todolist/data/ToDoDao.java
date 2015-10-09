package com.catalyst.todolist.data;

/**
 * Created by cat on 10/8/2015.
 */
public interface ToDoDao {
    /**
     * Use this to retrieve a list of all tasks.
     * @return a List<Task> object containing all employees.
     */
    List<Task> getList();
}
