package com.pankz.OOPS.builderdesignpattern;

public class Phonemain {
    public static void main(String[] args) {
        Phone phone1=new PhoneBuilder("dualcore")
                .setBattery(5000)
                .setScreenSize(6520)
                .build();
        System.out.println(phone1);

    }
}
//(Mandatory parameter have to have in your constructor)
//optional parameters can be set by setters