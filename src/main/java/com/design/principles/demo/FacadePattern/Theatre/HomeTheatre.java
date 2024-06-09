package com.design.principles.demo.FacadePattern.Theatre;

import com.design.principles.demo.FacadePattern.model.*;

public class HomeTheatre {

    private Amplifier amplifier;
    private CdPlayer cdPlayer;
    private DvdPlayer dvdPlayer;
    private Movie movie;
    private PopCornPepper popCornPepper;
    private Projector projector;
    private Screen screen;
    private TheatreLights theatreLights;
    private Tuner tuner;

    public HomeTheatre(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer, Movie movie, PopCornPepper popCornPepper, Projector projector, Screen screen, TheatreLights theatreLights, Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.movie = movie;
        this.popCornPepper = popCornPepper;
        this.projector = projector;
        this.screen = screen;
        this.theatreLights = theatreLights;
        this.tuner = tuner;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch movie : "+ this.movie.getName());
        popCornPepper.on();
        popCornPepper.pop();
        theatreLights.setScale(2);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setSurroundSound(8);
        amplifier.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.playMovie(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down movie theatre ");
        popCornPepper.off();
        theatreLights.setScale(10);
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.off();
    }
}
