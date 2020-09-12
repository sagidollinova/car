package com.company;

public class SmallCar extends Car {

    public SmallCar(CarType model, Location location)
    {
        super(model, location);
    }

    @java.lang.Override
    protected void construct() {
        System.out.println("Building Small car");
        //add accessories
    }
}
