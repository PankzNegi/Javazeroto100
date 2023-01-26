package com.pankz.search;

public class Lsearch {
    public static void main(String[] args) {
        int[]nums ={12,23,45,56,7,9,-98,-45,67};
        int target=45;
        int ans=Lsearch(nums,target);
        System.out.println("searched element is at"+ans);

    }
    static int Lsearch(int[]array,int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == target) {
                return i;
            }
        } return -1;
    }
}
