package com.pankz.Concurrency.multithreading.thread_pause;

public class CustomThread extends  Thread{
    private boolean shouldExit=false;

    public void setShouldExit(boolean shouldExit) {
        this.shouldExit = shouldExit;
    }

    public void run()
    {
        try
        {
            for(int i=0;i<30;i++)
            {
                if(shouldExit)
                {
                    break;
                }
                System.out.println("Thread Is Running");
                Thread.sleep(200);
            }
            System.out.println("Thread is completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
