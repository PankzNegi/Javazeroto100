package com.pankz.Revision.OOPSrev.packages;

public class Methods {
    int num;
    float val;
    public Methods(int num,float val) {
        this.num=num;
        this.val=val;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((Methods) obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        Methods obj=new Methods(56,78.67f);
        System.out.println(obj.hashCode());
        Methods obj2=obj;
        System.out.println(obj2.hashCode());
        Methods obj3=new Methods(56,96.78f);
        if(obj2.equals(obj3))
        {
            System.out.println("obj2 is equal than obj3");
        }
        System.out.println(obj2 instanceof Methods);
        System.out.println(obj2.getClass());
    }
}
