package com.pankz.Concurrency.multithreading.thread_join;

public class CalculaterRunnable implements  Runnable {
    long value;

    public CalculaterRunnable(long value) {
        this.value = value;
    }

    @Override
    public void run() {
        //checking how much time thread will take to complete
        long startTime=System.currentTimeMillis();
        long sum=0;
        for(long i=0;i<value;i++)
        {
            sum+=i;
        }
        long timeTaken=System.currentTimeMillis()-startTime;//processed time(elapsed time)
        System.out.println("Elapsed time:" +" " +timeTaken +" for thread"+ " " +Thread.currentThread().getName());
    }
}
