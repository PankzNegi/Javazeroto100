package com.pankz.OOPS.Interfaces.Nested;

public class P {
    //Nested interface
    public interface l {//nested interface can be declared as public,private & protected
        boolean isOdd(int n);
    }
    }
    class Q implements P.l
    {
        @Override
        public boolean isOdd(int n) {
            return (n&1)==1;
        }
    }
//outermost interface must be public or default one