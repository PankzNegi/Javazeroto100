package com.pankz.search;
//Finding smallest greater character the target (wrap up otherwise)
public class SmallestQ3 {
    public static void main(String[] args) {
        char [] arr={'c','d','f','j'};
        char ans=smallest(arr,'l');
        System.out.println(ans);



    }
    static char smallest(char[]array,char target)
    {
        int start=0;
        int end=array.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>array[mid])
            {
                start=mid+1;
            }else
            {
                end=mid-1;
            }

        } return array[start%array.length];
    }
}
