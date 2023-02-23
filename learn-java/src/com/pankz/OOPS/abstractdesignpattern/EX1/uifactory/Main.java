package com.pankz.OOPS.abstractdesignpattern.EX1.uifactory;

public class Main {
    public static void main(String[] args) {
        Application application=new Application(new WinUIFactory());
        application.paint();

    }
}
