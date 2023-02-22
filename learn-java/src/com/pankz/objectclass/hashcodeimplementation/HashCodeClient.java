package com.pankz.objectclass.hashcodeimplementation;

import java.util.HashSet;
import java.util.Set;

public class HashCodeClient {
    public static void main(String[] args) {
        Task task1=new Task("task1",false);
        Task task2=new Task("new_task2",true);
        System.out.println(task1.hashCode()==task2.hashCode());
        Set<Task> set=new HashSet<>();
        set.add(task1);
        set.add(task2);
        System.out.println(set.contains(task1));
        System.out.println(task1.hashCode());
        task1=new Task("task1",false); //o/p will be false if we overide hash otherwise true
        //its hashcode will be different from previous one
       // When we implement hashCode method both hash values remain same
        System.out.println(task1.hashCode());
        System.out.println(set.contains(task1));
        }
    }
    //Both the hashvalues are same if we implement hashCode method in data class
    // As it will try to find the bucket in which it is present using the hashCode.
//Once it finds the bucket it will try to find other using hashCode
