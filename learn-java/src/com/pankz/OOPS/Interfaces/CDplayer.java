package com.pankz.OOPS.Interfaces;

public class CDplayer implements Media {
    @Override
    public void start() {
        System.out.println("music started");
    }

    @Override
    public void stop() {
        System.out.println("music stop");
    }
}
