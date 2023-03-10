package com.pankz.Concurrency.multithreading.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ThreadPool obj=new ThreadPool();
        obj.startThreadPool();
    }

    private void startThreadPool() {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        WorkTask task1=new WorkTask("Task1");
        WorkTask task2=new WorkTask("Task2");
        WorkTask task3=new WorkTask("Task3");
        WorkTask task4=new WorkTask("Task4");
        WorkTask task5=new WorkTask("Task5");
        WorkTask task6=new WorkTask("Task6");

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.submit(task5);
        executorService.submit(task6);
        executorService.shutdown();
    }
}
