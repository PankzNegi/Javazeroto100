package com.pankz.setsandhashsets;

import java.util.*;

//What are sets in Java?
//A Set is a Collection that "cannot contain duplicate elements".
// It models the mathematical set abstraction.
// The Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements are prohibited.
//Group "like objects" and handle as a single unit
public class SetAndHashset {
    public static void main(String[] args) {
        //Creation of Set(here collection of Strings)
        Set<String> names = new HashSet<>(); //Set is an interface that extends Collection
        // and hashset is its implementation
        // Set<String>=new Set<> We can create instances of only classes that impelments interfaces
        //We can create instances of interfaces here Set is an interface(thats why Hashset<>)
        //HashSet is a class that implements Set interface.


        //Adding objects to Set
        names.add("Roy");
        names.add("Curl"); //set doesn't maintains order
        names.add("Peter");
        names.add("Ramesh");
        names.add("Karan");
        names.add("Kathe");
        //adding existing element again
        names.add("Curl"); //Set doesn't allow duplicates
        System.out.println(names);
        //removing objects from set
        names.remove("Peter");
        System.out.println(names);
        //We can't remove by index value as in List coz it doesn't maintain "order".


   //Current size of set
        System.out.println(names.size());
        //contains or not
        System.out.println(names.contains("John"));
        System.out.println(names.isEmpty());
   //Removing all objects from set
   //names.clear();


 //Iterating through set(here it will iterate through any order as set doesn't maintain order)
// for (String name:names)
// {
//     System.out.println(name);
//
//    }
 //If we want to iterate in a particular order

         Iterator<String> namesIterator=names.iterator();
         while(namesIterator.hasNext())
         {
             System.out.println(namesIterator.next());
         }
  //One scenario where we can use set is when we have to remove duplicate values from arraylist
  //Dump them in to set as set can't hold duplicates values (as shown below)
        List<Integer>numberList=new ArrayList<>();
        numberList.add(7);
        numberList.add(8);
        numberList.add(4);
        numberList.add(2);
        numberList.add(8);
        numberList.add(8);
        System.out.println(numberList);
    //Getting rid of duplicates.
    Set<Integer> numberSet=new HashSet<>();
    numberSet.addAll(numberList); //Adding elements from other collection to this collection
        System.out.println(numberSet); //duplicates removed
        // We can do this via parametized constructoer call then no need to use addAll();
        //Simply pass numberList to Hashset<> as HashSet<numberList>.

}
}