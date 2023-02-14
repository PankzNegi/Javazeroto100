package com.pankz.Revision.Generics;

import com.pankz.OOPS.Generics.Customarraylist;

import java.util.Arrays;

public class CustomArrayList {
    private int[]data;
    private static int DEFAULT_SIZE=10;
    private  int size=0;

    public CustomArrayList() {
        data=new int[DEFAULT_SIZE];

    }
    public void add(int num)
    {
        if(isFull())
        {
            resize();
        }
        data[size++]=num;

    }
    private boolean isFull()
    {
        return size==data.length;
    }
    private void resize()
    {
        int[]temp=new int[data.length*2];
        for(int i=0;i<data.length;i++)
        {
            temp[i]=data[i];
        }
        temp=data;
    }
    public int remove()
    {
       int removed= data[--size];
       return  removed;
    }
    public void set(int index,int value)
    {
        data[index]=value;
    }
    public int get(int index)
    {
        return data[index];
    }
    public int size()
    {
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list =new CustomArrayList();
        list.add(1);
        list.add(7);
        list.add(6);
        list.add(90);
        System.out.println(list);
    }
}
