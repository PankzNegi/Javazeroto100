package com.pankz.Concurrency.multithreading.thread_pool;

public class WorkTask implements Runnable{
    private  long createdTask;
    private String taskName;

    public WorkTask( String taskName) {
        this.createdTask = System.currentTimeMillis();
        this.taskName = taskName;
    }

    @Override
    public void run() {
        Thread currenrtThread=Thread.currentThread();
        long waitedTime=System.currentTimeMillis();
        System.out.println(taskName+"got cpu after waiting for"+waitedTime+"as with thread"+currenrtThread.getName());
        try
        {
            Thread.sleep(3000);
            System.out.println(taskName+"completed:releasing thread"+currenrtThread.getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
