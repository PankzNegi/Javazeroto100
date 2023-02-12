package com.pankz.OOPS.ComapringObj;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        Student obj=new Student(23,67.90f);
        Student obj2=new Student(5,99.78f);
        Student obj3=new Student(15,79.78f);
        Student obj4=new Student(34,89.78f);
        Student obj5=new Student(2,69.78f);
        Student[] list={obj,obj2,obj3,obj4,obj5};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        if(obj.compareTo(obj2)<0){
            System.out.println("obj2 has more marks");

        }

    }


}
