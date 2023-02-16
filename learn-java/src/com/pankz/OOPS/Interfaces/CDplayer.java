package com.pankz.OOPS.Interfaces;
//custom class for interface media
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
