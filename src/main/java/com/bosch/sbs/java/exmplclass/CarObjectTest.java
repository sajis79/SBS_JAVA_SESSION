package com.bosch.sbs.java.exmplclass;

public class CarObjectTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("This car's color is :" + myCar.color);
        System.out.println("This car's model number is :"+ myCar.modelName);

        myCar.startCar();

        myCar.accelerate();

        myCar.pressBreak();
    }
}
