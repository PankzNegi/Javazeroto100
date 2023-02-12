package com.pankz.OOPS.Generics;

import java.util.Arrays;

public class Customarraylist {

        private int[] data;
        private static int DEFAULT_SIZE=10;
        private int size=0;  //index value

    public Customarraylist() {
        data =new int[DEFAULT_SIZE];
    }
    public void add(int num)

    { if(isFull())
    {
        reSize();
    }
    data[size++]=num;


}
   private boolean isFull() {
         return size==data.length;
    }

    private void reSize() {
        int[]temp =new int[data.length*2];
        //copying current item in new array
        for(int i=0;i<data.length;i++)
        {
            temp[i]=data[i];
        }
        data=temp;   //new data which is in temp now OR data will point to temp now
    }
    public int remove()
    {
        int removed=data[--size];
        return removed;
    }
    public int get(int index)
    {
        return data[index];
    }
    public int size()
    {
        return size;
    }
    public void set(int index,int value)
    {
        data[index]=value;
    }

    @Override
    public String toString() {
        return "Customarraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Customarraylist list=new Customarraylist();
        list.add(3);
        list.add(7);
        list.add(67);
        System.out.println(list);
;    }
}
