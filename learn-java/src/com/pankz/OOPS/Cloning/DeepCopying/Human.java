package com.pankz.OOPS.Cloning.DeepCopying;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{6, 7, 8, 9, 12};
    }


    @Override
    public Object clone () throws CloneNotSupportedException {

        Human obj2=(Human)super.clone();  //actually a shallow copy
//Making it a deep copy
      obj2.arr=new int[obj2.arr.length];  //creating new array,otherwise it will point to same
      for(int i=0;i<obj2.arr.length;i++) {
          obj2.arr[i] = this.arr[i];
      }
      return obj2;


    }
}


