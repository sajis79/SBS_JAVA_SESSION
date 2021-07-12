package com.bosch.sbs.java.method;

import com.bosch.sbs.java.exmplclass.Car;

import java.io.IOException;
import java.util.IllegalFormatException;

public class MethodExample {
    public void method1(){
        //Method is public
    }

    private void method(){
        //Method is private
    }

    void methoda(){
        //Method is in default scope - inherited class can access
    }

    public final int methodb(){
        return 1; //Sub classes cannot provide different implementation for this method.
    }

    public int method2(){ //no argument
        return 1;
    }

    public int method1(int x){ //one argument
        return 2*x;
    }

    public String method1(int x, String y){ //multiple argument with different data type
        return x + y;
    }

    public Car repair(Car mycar) throws IOException, IllegalFormatException { //Throws one or more exception
        //mycar.repair();
        return mycar;
    }

    public static void staticMethod(){
        //How to call static method
        //Math class example
    }
}
