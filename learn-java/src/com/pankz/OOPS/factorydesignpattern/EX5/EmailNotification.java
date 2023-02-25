package com.pankz.OOPS.factorydesignpattern.EX5;


//Imlementation classes or concrete classes


public class EmailNotification implements  Notification{
    @Override
    public void notifyUser() {
        System.out.println("Email notification");
    }
}
