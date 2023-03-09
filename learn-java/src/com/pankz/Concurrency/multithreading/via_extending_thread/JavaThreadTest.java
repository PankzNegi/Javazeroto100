package com.pankz.Concurrency.multithreading.via_extending_thread;

//"Thread class" also implements "Runnable" interface so if we extend "Thread" it will automatically implements "Runnable"
public class JavaThreadTest extends Thread{
    public JavaThreadTest() {
        setName("JAVA Thread");
    }

    public void run()
    {
        System.out.println("Starting Thread"+Thread.currentThread().getName());
        try
        {
            for(int i=0;i<=5;i++)
            {
                System.out.println("Learning java");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Completed"+Thread.currentThread().getName());
    }
}
