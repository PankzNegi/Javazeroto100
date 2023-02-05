package com.pankz.OOPS;

public class Module2 {
    public static void main(String[] args) {
        B obj=new B("pankz");
        System.out.println(obj);  // it will print hash values

    }
}
class B
{
    String name;
    B(String name)
    {
        this.name=name;
    }
}
