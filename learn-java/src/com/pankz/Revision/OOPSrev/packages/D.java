package com.pankz.Revision.OOPSrev.packages;

public class D {
    int num;

    public D(int num) {
        this.num = num;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Garbage");
    }
}
