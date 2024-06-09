package com.design.principles.demo.FacadePattern.model;

public class TheatreLights {

    private Integer scale;

    public TheatreLights() {
        this.scale = 10;
    }

    public void setScale(int scale) {
        this.scale = scale;
        System.out.println("Theatre lights got dimmed to scale "+this.scale);
    }

}
