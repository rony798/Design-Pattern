package com.design.principles.demo.FacadePattern.model;

public class CdPlayer {

    private Movie movie;

    public void on() {
        System.out.println("CD playeyr is on");
    }

    public void off() {
        System.out.println("Cd Player is off");
    }

    public void playMovie(Movie movie) {
        this.movie = movie;
        System.out.println("Movie " + this.movie.getName()+ " is playing");
    }
}
