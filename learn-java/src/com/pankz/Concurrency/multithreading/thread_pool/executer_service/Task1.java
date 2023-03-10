package com.pankz.Concurrency.multithreading.thread_pool.executer_service;

public class Task1 extends Thread{
    public  void run()
    {
        System.out.print("Task1 started");
        for(int i=101;i<=199;i++)
        {
            System.out.print(i+" ");
            System.out.print("Task1 Done");
        }
    }
}
class Task2 implements Runnable
{

    @Override
    public void run() {
        System.out.print("Task2 started");
        for(int i=189;i<=199;i++)
        {
            System.out.print(i+" ");
            System.out.print("Task2 Done");
        }

    }
}
