package com.pankz.OOPS.factorydesignpattern.EX1;
//Client Class
public class FactoryMain {
    public static void main(String[] args) {
/*       OS obj=new Android();  If we run this code it will print android os but we are providing the implementation here
        If in future we have to change it from android to ios we have to change this code and recompile it.
        It means our client knows which class you are working with coz we are using "Android" keyword here
        So Factory pattern says instead of creating that way object what you can create is
        Create a class as OperatingFactory which will give you object of those particular OS
        So we have to expose it from the client */
//        obj.spec();
        //After creating factory
        OperatingSystemFactory osf=new OperatingSystemFactory();
        OS obj=osf.getInstance("Open"); //So we are using a factory object
        obj.spec();
    }
}
//In future if any changes occur you need not to change from client side you have to do modification only in your factory