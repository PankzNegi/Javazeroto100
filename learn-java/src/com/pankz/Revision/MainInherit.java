package com.pankz.Revision;

public class MainInherit {
    public static void main(String[] args) {
        Box box=new Box();
        Boxweight box2=new Boxweight();
        System.out.println(box2.l);
        Boxweight box3=new Boxweight(1,2,3,4);
        System.out.println(box3.h);
        System.out.println(box3.weight);
        Box box5=new Boxweight(2,3,4,8);
        Boxprice box9=new Boxprice();
        System.out.println(box9.weight);

    }
}
