package com.pankz.Concurrency.multithreading.thread_pause;

public class ThreadPauseResume {
    public static void main(String[] args) throws InterruptedException {
        CustomThread thread=new CustomThread();
        thread.start();
      //  thread.join(3000); //if it is not completed within that duration it will die
        Thread.sleep(3000);
        if(thread.isAlive())
        {
            thread.setShouldExit(true);
            thread.join();
        }
        System.exit(0);
    }
}
