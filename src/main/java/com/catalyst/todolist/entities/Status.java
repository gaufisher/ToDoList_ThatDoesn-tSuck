package com.catalyst.todolist.entities;

/**
 * Created by ddelaney on 10/12/2015.
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
