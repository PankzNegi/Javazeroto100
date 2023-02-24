package com.pankz.OOPS.factorydesignpattern.EX1;

import javax.swing.text.DefaultStyledDocument;
//This class manufacturing our objects and gives us the object
public class OperatingSystemFactory {
    public OS getInstance(String str )
    {
        if(str.equals("Open"))
            return new Android();
        else if(str.equals("Closed"))
            return new IOS();
        else return new Windows();
    }
}
/*Factory Design Pattern---->It focuses on how to create the objects
so it says there should be a interface/abstract classes/protocol which talks about the object creation
but the subclass or entity that is confirming to that protocol should be responsible for identifying what
type of object is to be created

 */