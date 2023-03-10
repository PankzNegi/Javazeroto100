package com.pankz.Concurrency.multithreading.synchronization.via_java_LOCK;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StringReverseThread extends Thread {
    private List<Character> name;
    private String message;
    private static Lock lock = new ReentrantLock(); //This lock must be shared between the threads

    public StringReverseThread(List<Character> name, String message) {
        this.name = name;
        this.message = message;
    }

    public void run() {
        lock.lock(); //This will acquire "lock object"
        // if 2 threads are coming and asking for lock at the same time only one of them is granted to access the lock
            try {
                System.out.println("names acquired by" + Thread.currentThread().getName()); //for checking the sync process
                // above statements shows names acquired by thread 0 then by thread 1.
                //We have to include the code which we have to synchronize within the blocks of syncronize.
                for (int i = 0; i < message.length(); i++) {
                    try {
                        name.add(message.charAt(i));
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(name);
            } finally {

                lock.unlock();
                //For more clarification ,the below sout is performed(how lock/unlock happening)
                System.out.println("lock unlocked by" + Thread.currentThread().getName());
            }
        }
    }

//synchronized only "the shared resources".