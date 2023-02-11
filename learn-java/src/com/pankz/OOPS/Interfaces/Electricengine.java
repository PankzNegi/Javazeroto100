package com.pankz.OOPS.Interfaces;

public class Electricengine implements Engine{
    @Override
    public void start() {
        System.out.println("Electeric engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electeric engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Electeric engine accelerated");

    }
}
