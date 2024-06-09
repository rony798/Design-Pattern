package com.design.principles.demo.FacadePattern.model;

public class DvdPlayer {

    private Movie movie;

    public void on() {
        System.out.println("Dvd Player got on");
    }

    public void playMovie(Movie movie) {
        this.movie = movie;
        System.out.println("Movie "+ this.movie.getName() + "is playing");
    }

    public void off() {
        System.out.println("Dvd Player got off");
    }
}
