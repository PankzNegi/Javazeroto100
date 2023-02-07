package com.pankz.OOPSprinciples.Polymorphism;

public class Numbers {
    int sum(int a,int b)
    {
       return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    // int sum(int a, double b,double c) error as return type is int (type conversion ocuurs if possible)
    double sum(int a, double b,double c) //return type is also double
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.sum(4,6);
        obj.sum(1,2,3);
        obj.sum(2,6.8989486747,2.834857857); // double b &c //if b and c given as int,no error becoz of type conversion
    }
}
//Method overloading-When a class has multiple method
// with same name(sum) but with different number,type,order,args.
//order means order of types
//(int a, String b)
//  (String b,int a)
//Type casting(with rules) can happen if the desired type is not given in inputs