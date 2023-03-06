package com.pankz.Concurrency;

public class ThreadExample2 {
    //class extending Thread class
    public static class MyThread extends Thread
    {
        public  void run() //overiding run() method
        {
            System.out.println("myThread running");
            System.out.println("myThread finished");
        }
    }

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
    }
}
