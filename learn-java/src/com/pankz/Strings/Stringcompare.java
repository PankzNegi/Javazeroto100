package com.pankz.Strings;

public class Stringcpmpare {
    public static void main(String[] args) {
        String a="pankaj";
        String b="pankaj";
        String d=b;
        System.out.println(d);
        System.out.println(a==b);//gives us true becoz  objects are same no new object is created for the reference variable b
        String c= new String("pankaj");
        System.out.println(a==c); //gives us false becoz new object is created
        System.out.println(a.equals(c)); //gives us true because .equals only compare only vlaues or doesnt care about ref var
        System.out.println(a.charAt(2)); //cant directly access like array arr[0]...arr[4]

    }

}
