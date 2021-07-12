package com.bosch.sbs.java.exmplclass;

import java.util.Date;

/**
 * 1. Car class
 * 2. Car Object
 * 3. public, package, final scopes(Access Modifiers/Access Specifiers)
 */

public  class Car {
    String carNumber = "KA11X1234";
    Date yearOfManufacture = new Date();
    Date yearOfPurchase = new Date();
    String brandName = "Ford";
    String modelName = "Ecosport";
    String color = "Red";
    int speed =0;
    String variant ="Mini SUV";


    public void startCar(){
        System.out.println("Car Started");
    }
    public void accelerate(){
        System.out.println("Car accelerating");
    }
    public void pressBreak(){
        System.out.println("Car Stopping... car stopped.");
    }
    public void reverse(){
        System.out.println("Car is reversing");
    }

}
