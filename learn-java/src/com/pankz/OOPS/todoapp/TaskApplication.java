package com.pankz.OOPS.todoapp;

import java.util.Date;

public class TaskApplication {
    public static void main(String[] args) {
        Task task=Task.createTask("Recorded",5);
        System.out.println(task);
      task.done();
        System.out.println(task);
        task.undone();
        System.out.println(task);
    }
}
