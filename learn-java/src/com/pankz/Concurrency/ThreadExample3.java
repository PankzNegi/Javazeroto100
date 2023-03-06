package com.pankz.Concurrency;

public class ThreadExample3 {
    public  static class MyRunnable implements Runnable
    {

        @Override
        public void run() {
            System.out.println("MyRunnable Running");
            System.out.println("MyRunnable finished");
        }
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new MyRunnable());
        thread.start();
    }
}
