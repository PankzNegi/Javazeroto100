package com.pankz.OOPS.Interfaces.Extending;

public class Main implements B {
    //implementing only B but have to override both methods as B extends A
    //therfore implementing both
    @Override
    public void fun() {  //Overiding method of A also

    }

    @Override
    public void message() {

    }

    public static void main(String[] args) {
        Main obj=new Main();
        A.greeting(); //calling static method of interfaces
        //Calling by interface name
    }
}
