package com.pankz.OOPS.Cloning.Shallow;


    public class ShallowCloning implements Cloneable {
        int age;
        String name;
        int[] arr;

        public ShallowCloning(int age, String name) {
            this.age = age;
            this.name = name;
            this.arr = new int[]{6, 7, 8, 9, 12};
        }


            @Override
            public Object clone () throws CloneNotSupportedException {
                return super.clone(); //Shallow copy
            }
        }
