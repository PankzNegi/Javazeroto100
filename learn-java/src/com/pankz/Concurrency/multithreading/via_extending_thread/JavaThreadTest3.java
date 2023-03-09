package com.pankz.Concurrency.multithreading.via_extending_thread;

public class JavaThreadTest3 extends Thread {
    public JavaThreadTest3() {
        setName("OOPS Thread");
    }

    public void run() {

        try {
            System.out.println("Thread Starting" + Thread.currentThread().getName());
            for (int i = 0; i <= 5; i++) {
                System.out.println("Learning OOPS");
                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Completed"+Thread.currentThread().getName());
    }
}
