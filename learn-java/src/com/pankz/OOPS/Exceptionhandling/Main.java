package com.pankz.OOPS.Exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            int c = a / b;   //arithematic exception
       //     divide(a,b);
            String name="Pankaj";
            if(name.equals("Pankaj"))
            {
                throw new CustomException(("name is pankaj"));
            }
        }

        catch(CustomException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) { //object e of Arithematic exception type
            //ArithematicException is a subclas of Exception so can write Exception also
            System.out.println(e.getMessage());
        }
        catch(Exception e)    //Catch normal exception
        {
            System.out.println("normal exception");
        }
        finally // "finally" It will still run if no exception is thrown
        {
            System.out.println("This will always execute");
        }
    }
    static int divide(int a,int b) throws ArithmeticException
    // "throws" used to "declare exception" (" telling us that this function may throw an exception)
    {
        if(b==0)
        {throw new ArithmeticException("this will not divide");
            //"throw" means we are throwing an exception

        }
        return a/b;
    }
}
//Exception includes everything
//Put more strict exception first otherwise below exception will not execute