package com.pankz.OOPS.todoapp;

import java.util.Date;
import java.util.Objects;

public class Task {
    private static final int DEFAULT_PRIORITY=1;
    private String title;
    private boolean completed;
    private final Date created;
    private int priority;

    private Task(Builder builder) {
        setTitle(builder.title);
        completed = builder.completed;
        created = builder.created;
        priority = builder.priority;
    }


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

    public int moreImportant(Task other) {
        if (this.priority < other.priority) {
            return -1;
        } else if (this.priority == other.priority) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int moreImportant(Task task1,Task task2) {
        if (task1.priority < task2.priority) {
            return -1;
        } else if (task1.priority == task2.priority) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", created=" + created +
                '}';
    }

    public static final class Builder {
        private String title;
        private boolean completed;
        private Date created;
        private int priority;

        public Builder() {
        }

        public Builder withTitle(String val) {
            title = val;
            return this;
        }

        public Builder withCompleted(boolean val) {
            completed = val;
            return this;
        }

        public Builder withCreated(Date val) {
            created = val;
            return this;
        }

        public Builder withPriority(int val) {
            priority = val;
            return this;
        }

        public Task build() {
            return new Task(this);
        }
    }
}
