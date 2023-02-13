package com.pankz.OOPS.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list =new ArrayList<>();
        List<Integer>listnew=new LinkedList<>();
        listnew.add(10);
        listnew.add(40);
        System.out.println(listnew);
        list.add(2);
        list.add(5);
        list.add(12);
        System.out.println(list);
    }
}
