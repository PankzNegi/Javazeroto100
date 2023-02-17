package com.pankz.OOPS.builderdesignpattern.Mobile;

public class Mobilemain {
    public static void main(String[] args) {
        Mobile mob1=new Mobile.Mobilebuilder("Redmi")
                .setColor("blue")
                .setRam("4gb").build();
        Mobile mob2=new Mobile.Mobilebuilder("Redmi")
                .setColor("blue")
                .setRam("4gb")
                .setProcessor("Dual core").build();
               System.out.println(mob1);
        System.out.println(mob2);
    }
}
