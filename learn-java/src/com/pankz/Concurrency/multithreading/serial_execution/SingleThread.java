package com.pankz.Concurrency.multithreading.serial_execution;

public class SingleThread {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++)
        {
            System.out.println("Learning java");
            Thread.sleep(200);
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("Learning HTML");
            Thread.sleep(200);
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("Learning OOPS");
            Thread.sleep(200);
        }
    }
}
