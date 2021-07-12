package com.bosch.sbs.java.polymorphism;

public class TestPolymorphismType2 {
    public static void main(String[] args) {
        PolymorpType2 object1 = new PolymorpType2();
        PolymorpExtendOne object2 = new PolymorpExtendOne();
        PolymorpExtendOneA object3 = new PolymorpExtendOneA();
        PolymorpExtendTwo object4 = new PolymorpExtendTwo();
        PolymorpType2 object5 = new PolymorpExtendOne(); //Check actual type and object created

        PolymorpExtendTwoA object6 = new PolymorpExtendTwoA();

        //PolymorpExtendTwoA twoa = new PolymorpType2(); Specific class cannot be assigned to super class

        object1.method1(); //This object has the method
        object2.method1(); //This object has the method
        object3.method1(); //This class doesn't have but searches in the super class and executes super class method.
        object4.method1(); //This object has method
        object5.method1(); //Example of assignment in type hierarchy
        object6.method1(); //searching till it finds the method in super classes always
        //If your design needs combination of type1 and type2 polymorphism then test the class thoroughly
        //So that you are sure the exact methods are called that you designed.

    }
}
