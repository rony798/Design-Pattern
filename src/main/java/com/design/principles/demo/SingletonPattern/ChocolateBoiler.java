package com.design.principles.demo.SingletonPattern;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        this.empty  = true;
        this.boiled = false;
    }

    public static synchronized ChocolateBoiler getChocolateBoiler() {
        if(chocolateBoiler ==  null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public void fill() {
        if(empty) {
            empty = false;
            boiled = false;
            System.out.println("Chocolate Boiler got filled");
        }
    }

    public void drain() {
        if(!empty && boiled) {
            empty = true;
            boiled = false;
            System.out.println("Chocolate Boiler got drained out");
        }
    }

    public void boil() {
        if(!empty && !boiled) {
            boiled = true;
            System.out.println("Chocolate Boiler got boiled");
        }
    }

}
