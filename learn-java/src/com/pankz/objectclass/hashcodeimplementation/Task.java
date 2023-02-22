package com.pankz.objectclass.hashcodeimplementation;

import java.util.Objects;

public class Task {
    private String title;
    private boolean completed;

    public Task(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }
    public String getTitle()
    {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return completed == task.completed && Objects.equals(title, task.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, completed);
    }
}
