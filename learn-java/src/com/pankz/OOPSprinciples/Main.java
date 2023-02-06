package com.pankz.OOPSprinciples;



public class Main {
    public static void main(String[] args) {
       Box box=new Box(); //call constructor with one args
        Box box1 =new Box(6); //constructor which have two args run it.
        Box box2=new Box(23,4,2);
        Box box3=new Box(box1);
        System.out.println(box.l +" "+ box.w + " " +box.h);
        System.out.println(box3.l+" "+box3.w +" "+box3.h);
        Boxweight box4=new Boxweight();
        System.out.println(box4.weight+" "+box4.l + " "+ box4.w+ " "+box4.h);
        //if we want to access it like as below make 4 arguments constructor first in boxweight
       Boxweight box5=new Boxweight(1,2,3,4);
       Box box6=new Boxweight(1,2,3,4); //referncing to type box i.e parent ojject type is boxweight
        //System.out.println(box6.weight); can acess l,h,w only
        //System.out.println(box6.weight);
      //gives error  Boxweight box7=new Box(2,3,4);
       // System.out.println(box7.l); as above class doesn't knows about below
        Boxprice box9=new Boxprice(5,8,200);
  }

}
