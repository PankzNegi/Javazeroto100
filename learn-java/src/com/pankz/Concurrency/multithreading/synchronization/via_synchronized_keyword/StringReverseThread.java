package com.pankz.Concurrency.multithreading.synchronization.via_synchronized_keyword;

import java.util.List;

public class StringReverseThread extends Thread {
    private List<Character> name;
    private String message;

    public StringReverseThread(List<Character> name, String message) {
        this.name = name;
        this.message = message;
    }

    public void run() {
        synchronized (name)   //which variable we have to synchronized.We cant sync "message" coz it is different for 2 diff. threads
        {

            System.out.println("names acquired by"+Thread.currentThread().getName()); //for checking the sync process
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
        }
    }
}
//synchronized only "the shared resources".