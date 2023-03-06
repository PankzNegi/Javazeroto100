package com.pankz.Concurrency;

public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() { //implementing runnable interface
            @Override
            public void run() {
                System.out.println("Runnable running");
                System.out.println("Runnable finished");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}