package com.pankz.Revision.Generics.Comparingobj;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student obj1=new Student(12,87.89f);
        Student obj2=new Student(4,95.78f);
        Student obj3=new Student(1,23.89f);
        Student obj4=new Student(24,58.78f);
        Student obj5=new Student(92,80.89f);
        Student obj6=new Student(40,92.78f);
      Student  list[]= {obj1,obj2,obj3,obj4,obj5,obj6};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
//        if(obj1.compareTo(obj2)<0)
//        {
//            System.out.println("obj2 has more marks");
//        }


    }


}
