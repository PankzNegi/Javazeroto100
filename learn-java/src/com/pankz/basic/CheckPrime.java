package com.pankz.basic;

public class CheckPrime {
    public static void main(String[] args) {


//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        boolean answer = Prime(num);
//        System.out.println(answer);
        for(int i=1;i<=50;i++)
        {
            if(Prime(i))
            {
                System.out.println(i);
            }
        }

    }

    static boolean Prime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n%c == 0) {
                return false;
            }
            c++;

        }
        if(c*c>n)
        {
            return true;
        }
return false;
    }
}
