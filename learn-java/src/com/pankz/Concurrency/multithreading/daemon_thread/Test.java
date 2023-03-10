package com.pankz.Concurrency.multithreading.daemon_thread;

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"start");
        UserThread threadobj=new UserThread();
        threadobj.setName("user thread");
        threadobj.setDaemon(true);
        threadobj.start();
        System.out.println(Thread.currentThread().getName()+"End");

    }
}
