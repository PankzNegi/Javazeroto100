package com.pankz.Strings;

public class Immuatability {
    public static void main(String[] args) {
        String a="Pankaj";
        System.out.println(a);
        a="negi";  //Not modifying but creating new object " " now 'a' goes into garbage collection
        System.out.println(a);
    }
}
//we can't modify strings ,same refernce variable's new objects{pankaj & negi} save in same pool of heap  memory