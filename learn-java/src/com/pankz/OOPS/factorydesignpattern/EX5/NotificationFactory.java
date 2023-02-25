package com.pankz.OOPS.factorydesignpattern.EX5;


//A factory class NotificationFactory is created "to get a Notification object"
//Creating a factory class NotificationFactory.java "to instantiate concrete class".


public class NotificationFactory {
   public Notification getNotification(String channel)
   {
      if (channel == null || channel.isEmpty())
         return null;
      switch (channel) {
         case "SMS":
            return new SMSNotification();  //returning object or instantiating concrete class
         case "EMAIL":
            return new EmailNotification(); //returning object or instantiating concrete class
         case "PUSH":
            return new PushNotification();  //returning object or instantiating concrete class
         default:
            throw new IllegalArgumentException("Unknown channel "+channel);
      }
   }
}



