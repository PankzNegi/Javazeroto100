package com.pankz.Concurrency.multithreading;
//Default Thread
public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=Thread.currentThread(); //return thread that is currently exceuting
        System.out.println(thread.getName());//printing name of thread via getName()
        //By default thread name is main but we can modify it via setName()
        thread.setName("MyThread");
        System.out.println(thread.getName());
        Thread.sleep(10000);
    }
}
