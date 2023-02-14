package com.pankz.Revision.OOPSrev;

public  class A {
    String name;

    public A(String name) {
        this.name = name;
    }

        @Override
        protected void finalize () throws Throwable {
            System.out.println("object is destroyed");
        }
    }

