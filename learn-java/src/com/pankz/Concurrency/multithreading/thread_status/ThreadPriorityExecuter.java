package com.pankz.Concurrency.multithreading.thread_status;

import com.pankz.Concurrency.multithreading.thread_priority.CalculaterRunnable;

public class ThreadPriorityExecuter {
    public static void main(String[] args) throws InterruptedException {
//        Thread thread=new Thread();
        com.pankz.Concurrency.multithreading.thread_priority.CalculaterRunnable obj = new CalculaterRunnable(1000000000);
        Thread thread1 = new Thread(obj);
        thread1.setName("HIGH PRIORITY");
        thread1.setPriority(Thread.MAX_PRIORITY); //Setting it to maximum priority
        thread1.start();
        while(thread1.isAlive())   //"Thread is active" keep on printing as long as thread is completed(i.e CalculaterRunnable code excecution)
        {
            System.out.println("Thread is Active");
            thread1.sleep(100);
        }
        System.out.println("Thread is completed");
        //once thread is completed i.eCalculaterRunnable then, isAlive() will return false


    }
}






