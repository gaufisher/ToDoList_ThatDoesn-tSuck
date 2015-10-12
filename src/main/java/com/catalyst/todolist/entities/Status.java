package com.catalyst.todolist.entities;

/**
 * This class represents the three states of a task.
 */
public enum Status{
    COMPLETE {
        @Override
            public String toString() {
                return "Complete";
            }
        },
    INCOMPLETE {
        @Override
            public String toString() {
                return "Incomplete";
            }
        },
    INPROGRESS {
        @Override
            public String toString() {
                return "In Progress";
            }
        }

}
