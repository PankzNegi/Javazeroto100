package com.pankz.Concurrency.multithreading;

public class JavaThreadTest3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread name:"+Thread.currentThread().getName());
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Learning OOPS");

                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thraed exceution completed"+Thread.currentThread().getName());
    }
}



