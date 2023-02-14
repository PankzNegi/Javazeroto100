package com.pankz.Revision;

public class A implements  Cloneable {
    int age;
    float marks;
    int[]arr;

    public A(int age, float marks) {
        this.age = age;
        this.marks = marks;
        this.arr=new int[]{3,5,6,7,8};
    }
   public Object clone() throws CloneNotSupportedException
   {
//       return super.clone();
       A obj2=(A) super.clone();
       obj2.arr=new int [obj2.arr.length];
       for(int i=0;i<obj2.arr.length;i++)
       {
           obj2.arr[i]=this.arr[i];
       }
       return obj2;
   }

}
