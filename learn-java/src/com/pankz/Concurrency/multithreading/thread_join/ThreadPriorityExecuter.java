package com.pankz.Concurrency.multithreading.thread_join;

import com.pankz.Concurrency.multithreading.thread_priority.CalculaterRunnable;

public class ThreadPriorityExecuter {
    public static void main(String[] args) throws InterruptedException {

        com.pankz.Concurrency.multithreading.thread_priority.CalculaterRunnable obj=new CalculaterRunnable(1000000000);
        Thread thread1=new Thread(obj);
        thread1.setName("HIGH PRIORITY");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();

//it will wait for the thread from which you are calling(will wait for called thread)here thread1
       // thread1.join(); //it will print the elapsed time and then exit
        // But what if we specify the max wait time  for e.g 5 sec??
        thread1.join(500); //It will wait for 5 sec max for this thread in case it is completed within that time well and got otherwise it wil leave(thread will die)
        System.out.println("Join completed");
        System.exit(0);







    }
}
