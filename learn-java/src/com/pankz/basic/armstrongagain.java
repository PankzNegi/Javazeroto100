package com.pankz.basic;

public class armstrongagain {
    public static void main(String[] args) {
//        Scanner input=new Scanner (System.in);
//        int num=input.nextInt();
//        boolean answer=checkarm(num);
//        System.out.println(answer);
        for(int i=1;i<=1000;i++)
        {
            if(checkarm(i))
            {
                System.out.println(i);
            }
        }

    }
    static boolean checkarm(int n)
    {
        int sum=0;
        int original=n;
        while(n>0)
        {
            int rem=n%10;
            n/=10;
            sum+=rem*rem*rem;
        }
        if(sum==original){
            return true;

        }
        return false;

    }
}
