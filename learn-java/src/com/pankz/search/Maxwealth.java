package com.pankz.search;

public class Maxwealth {
    public static void main(String[] args) {
        int[][] account = {{1, 20, 30}, {35, 28, 1}};
        int maximumwealth = Maxwealth(account);
        System.out.println("maximum wealth is=" + maximumwealth);


    }

    static int Maxwealth(int[][] accounts) {

        int max = 0;
        for (int customer = 0; customer < accounts.length; customer++) {
            int sum = 0;
            for (int bank = 0; bank < accounts[customer].length; bank++) {
                sum += accounts[customer][bank];
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
