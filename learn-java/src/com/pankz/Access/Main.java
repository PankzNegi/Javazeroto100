package com.pankz.Access;

public class Main {
    public static void main(String[] args) {
        A obj=new A(12,"pankaj");
     // obj.getNum(); // private members can access via
        System.out.println(obj.num);

    }
}
