package com.pankz.OOPS.Interfaces;

public class Powerengine implements  Engine{
    @Override
    public void start() {
        System.out.println("power engine started");
    }

    @Override
    public void stop() {
        System.out.println("power engine stops");

    }

    @Override
    public void acc() {
        System.out.println("power engine accelerated");

    }
}
