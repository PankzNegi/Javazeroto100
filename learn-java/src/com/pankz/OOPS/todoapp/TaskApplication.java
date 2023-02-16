package com.pankz.OOPS.todoapp;

import java.util.Date;

public class TaskApplication {
    public static void main(String[] args) {
        Task task1=Task.createTask("Recorded",5);

      Task task2=  Task.createTaskWithDefaultPriority("workout");
       int i= task1.moreImportant(task2);
        System.out.println(i);
        i=Task.moreImportant(task1,task2);
        System.out.println(i);
       Task task= new Task.Builder()
                .withTitle("hello")
                .withPriority(1)
                .withCompleted(false)
                .build();
    }
}
