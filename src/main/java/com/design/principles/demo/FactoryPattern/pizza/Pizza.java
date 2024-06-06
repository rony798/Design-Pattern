package com.design.principles.demo.FactoryPattern.pizza;

public abstract class Pizza {

    protected String description;
    protected long price;
    protected String dough;
    protected String sauce;

    public void prepare() {
        System.out.println("Preparing "+ this.description);
        System.out.println("Adding "+ this.getDough());
        System.out.println("With sauce "+ this.getSauce());
    }

    public void bake() {
        System.out.println("Baking " + this.description);
    }

    public void cut() {
        System.out.println("Cutting " + this.description);
    }

    public void box() {
        System.out.println("Boxing "+ this.description);
    }

    public String getDescription() {
        return description;
    }

    public long getPrice() {
        return price;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public abstract long getCost();
}
