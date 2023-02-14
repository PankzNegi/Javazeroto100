package com.pankz.Revision.Generics;

import java.util.Arrays;

public class Wildcards<T extends Number> {
    private Object[]data;
    private static int DEFAULT_SIZE=10;
    private  int size=0;

    public Wildcards() {
        data=new Object[DEFAULT_SIZE];

    }
    public void add(T num)
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
        Object[]temp=new Object[data.length*2];
        for(int i=0;i<data.length;i++)
        {
            temp[i]=data[i];
        }
        temp=data;
    }
    public T remove()
    {
       T removed= (T) data[--size];
       return  removed;
    }
    public void set(int index,int value)
    {
        data[index]=value;
    }
    public T get(int index)
    {
        return (T) data[index];
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
        Wildcards <Number>list =new Wildcards();
        list.add(1);
        list.add(7);
        list.add(6);
        list.add(90);
        list.add(12.56f);
        list.add(5657.97958649758);
        System.out.println(list);
    }
}
