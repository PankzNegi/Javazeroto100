package com.pankz.OOPS.todoapp;

import java.util.Date;
import java.util.Objects;

public class Task {
    private String title;
    private boolean completed;
    private final Date created;
    private int priority;
    private static final int DEFAULT_PRIORITY=1;

    public static Task createTask(String title,int priority)
    {
        return new Task(title,priority);
    }
    public static Task createTaskWithDefaultPriority(String title)
    {
        return new Task(title,DEFAULT_PRIORITY);
    }

    private Task(String title,int priority) {
        this.title = title;
        this.completed=false;
        this.created=new Date();
        this.priority=priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }



    public Date getCreated() {
        return created;
    }
    public void done()
    {
        this.completed=true;
    }
    public void undone()
    {
        this.completed=false;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", created=" + created +
                '}';
    }

}
