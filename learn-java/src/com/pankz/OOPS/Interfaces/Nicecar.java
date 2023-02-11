package com.pankz.OOPS.Interfaces;

public class Nicecar {
    private Engine engine;
    private Media player;
    public Nicecar()  //constructor
    {
        engine=new Powerengine();
        player=new CDplayer();;

    }
// can add engine of your own in below constructor
//    public Nicecar(Engine engine) {
//        this.engine = engine;
//    }
    public  void start()
    {
        engine.start();
    } //call engine accordingly
    public void stop()
    {
        engine.stop();
    }  //stop engine accordingly
    public void startmusic()
    {
        player.start();
    }
    public void stopomusic()
    {
        player.stop();
    }
    public void upgradeEngine()
    {
        this.engine=new Electricengine();
    } //upgrade engine accordingly
}
//All things operated from this class Newcar