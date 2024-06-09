package com.design.principles.demo.FacadePattern.model;

public class Amplifier {

    private DvdPlayer dvdPlayer;
    private Integer surroundSound;
    private Integer volume;

    public void setDvdPlayer(DvdPlayer  dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println("Amplifier gets on");
    }

    public void setSurroundSound(Integer surroundSound) {
        this.surroundSound = surroundSound;
        System.out.println("Amplifier surround sound gets set to : "+ this.surroundSound);
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
        System.out.println("Amplifier sounnd set to "+ this.volume);
    }


    public void off(){
        System.out.println("Amplifier got down");
    }
}
