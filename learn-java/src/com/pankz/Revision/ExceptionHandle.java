package com.pankz.Revision;

public class ExceptionHandle {
    public static void main(String[] args) {
        int a =10;
        int b=0;
        try {
            // divide(a,b);

            String name = "pankaj";
            if (name.equals("pankaj")) {
                throw new MyException("name is pankaj");
            }
        }
        catch(MyException e)
            {
                System.out.println(e.getMessage());
            }
//        catch(ArithmeticException e)
//        {
//            System.out.println("arithematic exception");
//        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("this will always print");
        }

    }
    static int divide(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
           throw new ArithmeticException("PLEASE DO NOT DIVIDE BY ZERO"); //throwing explicitly
        }
        return a/b;
    }

}
