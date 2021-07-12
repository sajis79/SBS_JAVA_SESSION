package com.bosch.sbs.java.method;

public class PassByValue {

    public static void main(String[] args) {
        int a = 10; //primitive types
        System.out.println("value of a = " +a);
        int b = doubleTheValue(a);
        System.out.println("value of a = " +a);

    }

    //This happens with primitive types only
    private static int doubleTheValue(int a){
        System.out.println("value of x = " +a);
        a = a*2;
        return a;

    }
}
