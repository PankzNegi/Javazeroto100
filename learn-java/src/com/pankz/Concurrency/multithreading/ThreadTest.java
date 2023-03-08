package com.pankz.Concurrency.multithreading;

public class ThreadTest {
    public static void main(String[] args) {
        createJavaThread();
        createHTMLThread();
        createOOPSThraed();
    }
    private static void createJavaThread() {
        JavaThreadTest threadTest=new JavaThreadTest();
        Thread thread=new Thread(threadTest);
        thread.setName("JAVA thread");
        thread.start(); //it checks for runnable object now i.e threadtest and looks for run()
        //Starting point for thread is run()
    }
    private static void createHTMLThread() {
        JavaThreadTest2 threadTest2=new JavaThreadTest2();
        Thread thread=new Thread(threadTest2);
        thread.setName("HTML Thread");
        thread.start();
    }
    private static void createOOPSThraed() {
        JavaThreadTest3 threadTest3=new JavaThreadTest3();
        Thread thread=new Thread(threadTest3);
        thread.setName("OOPS Thread");
        thread.start();
    }
}
