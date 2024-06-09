package com.design.principles.demo.FacadePattern.Theatre;

import com.design.principles.demo.FacadePattern.model.*;

public class HomeTheatreTestDrive {

    public static void main(String[] args) {

        Amplifier amplifier = new Amplifier();
        CdPlayer cdPlayer = new CdPlayer();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Movie movie = new Movie();
        movie.setName("The Ring");
        PopCornPepper popCornPepper = new PopCornPepper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheatreLights theatreLights = new TheatreLights();
        Tuner tuner = new Tuner();

        HomeTheatre homeTheatre = new HomeTheatre(amplifier, cdPlayer, dvdPlayer, movie, popCornPepper, projector, screen, theatreLights, tuner);
        homeTheatre.watchMovie();
        homeTheatre.endMovie();

    }
}
