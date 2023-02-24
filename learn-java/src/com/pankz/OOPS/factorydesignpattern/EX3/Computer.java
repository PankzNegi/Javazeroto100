package com.pankz.OOPS.factorydesignpattern.EX3;

public interface  Computer {
    public abstract String ram ();
    public abstract  String hdd();
    public abstract String cpu();
    public  boolean isGraphicCardEnabled();
    public boolean isBluetoothEnabled();
}
