package com.pankz.Concurrency.multithreading.thread_priority;

public class ThreadPriorityExecuter {
    public static void main(String[] args) {
//        Thread thread=new Thread();
        CalculaterRunnable obj=new CalculaterRunnable(1000000000);
        Thread thread1=new Thread(obj);
        thread1.setName("HIGH PRIORITY");
        thread1.setPriority(Thread.MAX_PRIORITY); //Setting it to maximum priority
        thread1.start();



        Thread thread2=new Thread(obj);
        thread2.setName("MINIMUM PRIORITY");
        thread2.setPriority(Thread.MIN_PRIORITY); //Setting it to minimum priority
        thread2.start();


        Thread thread3=new Thread(obj);
        thread3.setName("NORMAL PRIORITY");
        thread3.setPriority(Thread.NORM_PRIORITY); //Setting it to maximum priority
        thread3.start();
    }
}
//If there is only one thread that is running in a program less % in CPU(Taskbar)
//So with increases in processor we can achieve parallelism.(more cores will be allocated)
//One core is doing one thread another core doing another thread