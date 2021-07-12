package com.bosch.sbs.java.loops;
/**
 *
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/
 * This link has all java language constructs except collection with example

 */
public class WhileLoopExample {
    public static void main(String[] args) {

    }


    public void whileLoopExecutor(){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
        /*

        while(true){ infinite loop example - be careful to use this
            //Statements
        }


         */
    }

    public void doWhileLoopExecutor(){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }

}
