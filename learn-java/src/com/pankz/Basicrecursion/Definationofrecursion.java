package com.pankz.Basicrecursion;

public class Definationofrecursion {
    public static void main(String[] args) {
        print(1);

    }
    static void print(int n)
    {

        if(n==5)
        {                           //Last function defination was differenr ,it was only souting not calling
            System.out.println(5); //Stopping recursive call after 5 i.e base condition otherwise it keep calling itself
            return;
        }
        System.out.println(n);
        print(n+1);      //Function calling itself i.e RECURSION Tail recursion -->last function call
    }
}
//Every function call will take separate m/m in stack.