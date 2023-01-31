package com.pankz.Basicrecursion;

public class Introduction {
    public static void main(String[] args) {
        greeting();     //if we have to print it multiple time the one choice we can call it multiple time.
        greeting();
        greeting();
    }
        static void greeting ()
        {
            System.out.println("hello there"); //Or we can sout multiple time
            System.out.println("hello there");
            System.out.println("hello there");
            System.out.println("hello there");

        }
    }
//In above two approaches we have to call multiple time,but cant we do this by only one function call