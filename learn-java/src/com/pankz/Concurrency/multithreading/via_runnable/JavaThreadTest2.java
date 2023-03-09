package com.pankz.Concurrency.multithreading.via_runnable;

public class JavaThreadTest2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread name:"+Thread.currentThread().getName());
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Learning HTML");

                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thraed exceution completed"+Thread.currentThread().getName());
    }
}



