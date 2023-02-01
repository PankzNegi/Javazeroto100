package com.pankz.RecursioninArrays;
//Find an item in an array using linear search in recursion
public class Q2Linearsearch {
    public static void main(String[] args) {
        int[] array = {23, 45, 78, 90, 123, 468, 900};
          boolean answer=Linearsearch(array,78,0); //i=index value

        System.out.println(answer);

    }
    static boolean Linearsearch(int[]arr,int target,int i)
    {
        if(i==arr.length)  //when crosiing the boundation i.e base condition
        {
            return false;
        }


        return arr[i]==target || Linearsearch(arr,target,i+1);
    }
}
//We can also return the index value where the target is present instead of bollean



