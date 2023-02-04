package com.pankz.Permutation_Combination;

public class Q2 {
    public static void main(String[] args) {
       int answer= CountPermutations("","pqr");
        System.out.println(answer);

    }

    static int CountPermutations(String subset, String original) {
        if (original.isEmpty()) {

            return 1;   //Returning count from last levels
        }
        int count=0;
        char ch = original.charAt(0);
        for (int i = 0; i <= subset.length(); i++) {
            String firsthalf = subset.substring(0, i);
            String secondhalf = subset.substring(i, subset.length());
           count=count+ CountPermutations(firsthalf + ch + secondhalf, original.substring(1));
        }
        return count;
    }

}
