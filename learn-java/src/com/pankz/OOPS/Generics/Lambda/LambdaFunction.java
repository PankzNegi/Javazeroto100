package com.pankz.OOPS.Generics.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            arr.add(i+1);
        }
       // arr.forEach((item)->System.out.println(item*2));
        Consumer<Integer>fun=((item)->System.out.println(item*2)); //storing it in a consumer type
        arr.forEach(fun);
        Operation sum=(a,b)->a+b;  //->a+b is the body
        Operation diff=(a,b)->a-b;
        Operation product=(a,b)->a*b;
        Operation div=(a,b)->a/b;
        LambdaFunction mycalculator=new LambdaFunction();
        System.out.println(mycalculator.operate(2,5,sum));
        System.out.println(mycalculator.operate(3,6,diff));


    }
   private int operate (int a,int b,Operation op)
   {
       return op.operation(a,b);
   }
}
interface Operation
{
    int operation(int a,int b);
}
