package com.pankz.adapter_design_pattern.EX2;



public class IEdriver implements Explorerdriver {
    @Override
    public void findElement() {
        System.out.println("Find element from IE driver");
    }

    @Override
    public void clickElement() {
        System.out.println("Click Element from IE driver");

    }
}
