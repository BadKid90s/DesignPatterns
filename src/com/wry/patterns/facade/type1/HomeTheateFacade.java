package com.wry.patterns.facade.type1;

/**
 * 家庭影院外观
 */
public class HomeTheateFacade {
    //各个子系统
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;

    public HomeTheateFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn =  Popcorn.getInstance();
        this.projector =  Projector.getInstance();
        this.screen =  Screen.getInstance();
        this.stereo =  Stereo.getInstance();
    }


    /**
     *准备工作
     */
    public void ready(){
        dvdPlayer.open();
        projector.open();
        screen.down();
        stereo.open();
        popcorn.on();

    }

    public void play(){
        dvdPlayer.play();
    }

    public void end(){
        screen.up();
        stereo.open();
        projector.off();
        popcorn.off();
        dvdPlayer.off();
    }
}
