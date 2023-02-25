package com.pankz.OOPS.factorydesignpattern.EX5;

//Using factory class to create and get an object/instance of concrete class by passing some information.

public class ClientNotificationservice {
    public static void main(String[] args) {
        NotificationFactory nsf = new NotificationFactory();
        Notification notification = nsf.getNotification("EMAIL"); //getting an instance of concrete classes from factory
        notification.notifyUser();


    }
}