package com.bosch.sbs.java.polymorphism;

/**
 * Based on the type of the parameter passed JVM selects which method to run
 * same name of the method and different operations behind
 * No need to remember multiple name for same kind of operation, for different data types
 * in some places you may have seen run method, or execute method that works similarly.
 */
public class PolymorphismType1 {

    public double addTwoNumbers(int i, int  j){
        System.out.println("int variant");
        return i+j;
    }

    public float addTwoNumbers(float i, float  j){
        System.out.println("float variant");
        return i+j;
    }

    public long addTwoNumbers(long i, long  j){
        System.out.println("long variant");
        return i+j;
    }

    public double addTwoNumbers(double i, double  j){
        System.out.println("double variant");
        return i+j;
    }
}

