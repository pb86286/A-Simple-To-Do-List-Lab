package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String description) {
        if (description == null || description.isBlank()) {
            System.out.println("Cannot add an empty task.");
            return;
        }
        tasks.add(new Task(description));
    }

    public void complete(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description) && !task.isComplete()) {
                task.markComplete();
                return;
            }
        }
        System.out.println("Task not found or already completed.");
    }

    public void all() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void complete() {
        boolean anyComplete = false;
        for (Task task : tasks) {
            if (task.isComplete()) {
                System.out.println(task);
                anyComplete = true;
            }
        }
        if (!anyComplete) {
            System.out.println("No completed tasks.");
        }
    }

    public void incomplete() {
        boolean anyIncomplete = false;
        for (Task task : tasks) {
            if (!task.isComplete()) {
                System.out.println(task);
                anyIncomplete = true;
            }
        }
        if (!anyIncomplete) {
            System.out.println("No incomplete tasks.");
        }
    }

    public void clear() {
        tasks.clear();
        System.out.println("All tasks cleared.");
    }
}