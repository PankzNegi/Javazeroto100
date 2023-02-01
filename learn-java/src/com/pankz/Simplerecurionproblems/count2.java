package com.pankz.Simplerecurionproblems;

public class count2 {
    public static void main(String[] args) {
   count(60809030);

        System.out.println(countno);



    }
static int countno=0;
    static int count(int n) {
        if(n==0)
        {
            return 1;
        }
        if(n%10==0)
        {
            countno++;
        }
        count(n/10);
        return countno;

    }

}