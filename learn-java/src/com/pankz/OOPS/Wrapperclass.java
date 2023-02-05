package com.pankz.OOPS;

public class Wrapperclass
{
    public static void main(String[] args) {
//        int a=56;//primitive
//        Integer number=57;//Wrapper class ,num is an object
        Integer a=12;
        Integer b=50;
        swap(a,b);
        System.out.println(a+" " +b);
        final int salary=20000;
//        salary=50000; can't modify final,hold true only for primitive data types
       final A stud=new A("pankaj");
       stud.name="mohit";
       stud.name="ankit"; //can modify
     //stud=new A("mohit"); //when non primitive is final you cant reassign
        System.out.println(stud.name);
        for(int i=0;i<100000000;i++)        //Garbage collection scenerio
        {
            A obj=new A("mantu");
        }
    }
    static void swap(Integer a,Integer b)
    {
        Integer temp=a;   //coz of final keyword it is not modifying
        a=b;
        b=temp;

    }

}
//Here value will not swap, as in java their is pass by value not pass by refernce
//By converting it into wrapper class,here also it is not changing the orig. val

class A
{
//    final int num; error of not initialsing,always initialise final
    final int num=10;
    String name;
    A(String name)
    {
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("garbage collection");
    }
}