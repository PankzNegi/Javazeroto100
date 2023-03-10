package com.pankz.Concurrency.multithreading.synchronization.via_synchronized_keyword;

import java.util.ArrayList;
import java.util.List;

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        List<Character> list = new ArrayList<>();


        Thread thread1 = new StringReverseThread(list, "HELLO"); //sharing same resources of list
        thread1.start();


        Thread thread2 = new StringReverseThread(list, "WORLD"); //sharing same resources of list
        thread2.start();
        thread1.join();
        thread2.join();
        //Right now the o/p is not as expected coz both thread running simultaneously
        //Fix-We have to make sure that only one thread will be getting accessed to list one at a time
        //In StringReverseThread "name" any no. of thread can acquire this name,therefore use keyword synchronized
    }
}
//NOTE:In this case if we use two different array list  for 2 different thread.
// then there is no need of any synchronization.(new ArrayList<character>)
//as for sync their must be "shared resources".

/*
Synchronization in java is the capability to control the access of multiple thread to any shared resources
Only one thread can own a monitor at a given time.
 */