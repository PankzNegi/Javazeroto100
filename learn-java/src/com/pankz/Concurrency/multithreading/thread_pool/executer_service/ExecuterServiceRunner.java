package com.pankz.Concurrency.multithreading.thread_pool.executer_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        //It provides facilities to execute one thread at a time
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2())); //coz of runnable method i.e object pass

        //Task3-not executed by executer ,it is executed by main
        //Only when task1 is completed task2 will be executed ,task3 can run in between as not run by executer
        System.out.print("\nTask3 started");
        for(int i=301;i<399;i++)
        {
            System.out.print("\nTask 3 done");
        }
        executorService.shutdown();
    }
}
//We added task 3 to see at what point of time these code of executer service is running
//o/p Task1 started-->Task3 started--->task3 done then only task2 executed