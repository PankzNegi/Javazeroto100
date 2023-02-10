package com.pankz.Access;

public class Objectdemo {
    int num;
    float value;

    public Objectdemo(int num,float value) {
        this.num = num;
        this.value=value;
    }

    @Override
    public int hashCode() {   //gives unique number representation of objects
        return super.hashCode();
       // return num; if we only return numbers as return num; then o/p will be same for both objects
    }

    @Override
    public boolean equals(Object obj) { //as obj is of type object
        //return super.equals(obj);
        return this.num==((Objectdemo)obj).num;  //Casting to Objectdemo type
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Gives the string representation
    @Override
    public String toString() {
        return super.toString();
    }

    //Get calls when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public static void main(String[] args) {
        Objectdemo obj = new Objectdemo(20,89.67f);
        System.out.println(obj.hashCode());
       // Objectdemo obj2=obj; o/p will remain same as objects are same
        Objectdemo obj2 = new Objectdemo(20,45.89f); //o/p will be different for obj2
        System.out.println(obj2.hashCode());
        Objectdemo obj3=new Objectdemo(20,90.48f);
        if(obj==obj3)  //Compareter , checking (addresses) variable pointing to same object or not
        {
            System.out.println("obj is equal to obj3");
        }
        if(obj.equals(obj3))   //Method,checking the content
        {
            System.out.println("obj is equal to obj3");
        }
        //Use of getClass method
        System.out.println(obj3.getClass());
        //can get the data about class also by getClass().
        System.out.println(obj3.getClass().getName());

    }
}
