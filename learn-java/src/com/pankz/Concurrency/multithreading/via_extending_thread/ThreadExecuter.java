package com.pankz.Concurrency.multithreading.via_extending_thread;

public class ThreadExecuter {
    public static void main(String[] args) {
        createJavaThread();
        createHTMLThread();
        createOOPSThread();
    }


    public static void createJavaThread() {
        new JavaThreadTest().start();
    }

    public static void createHTMLThread() {
        new JavaThreadTest2().start();
    }

    private static void createOOPSThread() {
        new JavaThreadTest3().start();
    }

}
