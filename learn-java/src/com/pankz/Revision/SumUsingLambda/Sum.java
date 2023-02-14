package com.pankz.Revision.SumUsingLambda;

public class Sum {
    public static void main(String[] args) {
        Sumattion total=(a,b)->(a+b);

        System.out.println(total.sum(4,7));


    }

}
