package com.bosch.sbs.java.loops;

import java.util.ArrayList;
import java.util.Iterator;

public class ForLoopExample {
    public static void main(String[] args) {
        forLoopType1();

        forLoopType2();
    }

    //For loop type -1
    public static void forLoopType1(){
      /*
      for (initialization; termination;increment) {
           statement(s)
      }
       */
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }


        // infinite loop - do not run without purpose
      //  for ( ; ; ) {

            // your code goes here
       // }
    }

    public static void forLoopType2(){
        int[] numbers =
                {1,2,3,4,5,6,7,8,9,10};
        ArrayList<String> als = new ArrayList<>();
        als.add("Mysore");
        als.add("Bangalore");
        als.add("Madikeri");
        als.add("Hassan");
        als.add("Ramnagar");

        Iterator<String> itrAL = als.iterator();
        while(itrAL.hasNext()){
            System.out.println(itrAL.next());
        }

/*
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
        for (String s: als) {
            System.out.println(s);
        }*/
        //TODO Get to know about System class.
        //Accessing environment and sys properties with System class
        //how to shut down program etc.
    }
}
