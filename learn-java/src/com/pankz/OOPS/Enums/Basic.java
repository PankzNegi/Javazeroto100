package com.pankz.OOPS.Enums;

public class Basic {
    enum Weekday
    {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
        //enums constants
        //by default they are Public,Static &final
        //final prevents inheritence
        //Type is classname

    }

    public static void main(String[] args) {
//        Weekday week;
//        week=Weekday.Monday;
        for(Weekday day:Weekday.values())
        {
            System.out.println(day);
            System.out.println(day.ordinal()); //position of enum deceleration
        }
    }
}
  //  Java Enum is a data type which contains fixed set of constants
//An enum is a special "class" that represents a group of constants
// (unchangeable variables, like final variables).