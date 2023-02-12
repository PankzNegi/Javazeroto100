package com.pankz.OOPS.Generics;

import java.util.Arrays;
//More restricness by wildcards
public class Wildcardexample<T extends Number> {
    //T should be number or its subclass
        private Object[] data;
        private static int DEFAULT_SIZE=10;
        private int size=0;  //index value

    public Wildcardexample() {
        this.data =new Object[DEFAULT_SIZE];
    }
    public void add(T num)

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
        Object[]temp =new Object[data.length*2];
        //copying current item in new array
        for(int i=0;i<data.length;i++)
        {
            temp[i]=data[i];
        }
        data=temp;   //new data which is in temp now OR data will point to temp now
    }
    public T remove()
    {
        T removed= (T) data[--size];
        return removed;
    }
    public T get(int index)
    {
        return (T) data[index];
    }
    public int size()
    {
        return size;
    }
    public void set(int index,T value)
    {
        data[index]= value;
    }

    @Override
    public String toString() {
        return "Customarraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Wildcardexample<Float>list=new Wildcardexample(); //can provide float,integer,double anything
        list.add(90.8f);
        list.add(7.2f);
        list.add(43.5f);
        System.out.println(list);
;    }
}
