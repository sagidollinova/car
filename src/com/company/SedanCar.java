package com.company;

public class SedanCar extends Car
{
    public SedanCar(CarType model, Location location) {
        super(model, location);
    }

    @java.lang.Override
    protected void construct() {
        System.out.println("Building Sedan car");
        //add accessories
    }
}
