package com.pankz.OOPS.factorydesignpattern.EX5;


//Imlementation classes or concrete classes
public class SMSNotification implements  Notification{
    @Override
    public void notifyUser()
    {

        System.out.println("Sending an SMS notification");
    }
}

