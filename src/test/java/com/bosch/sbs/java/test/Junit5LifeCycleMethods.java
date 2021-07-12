package com.bosch.sbs.java.test;

import org.junit.jupiter.api.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Junit5LifeCycleMethods {
    @BeforeAll
    void initBeforeAll(){
        //TODO code for some initial setup for the test class goes here.
        System.out.println("-----initBeforeAll-----");
        /*
        You have a object that is needed by all the test method or most of the method
        and the data inside the object should be same before each test execution.
        This will run only once per instance of class.
         */
    }

    @BeforeEach
    void initBeforeEach(){
        //TODO code for some initial setup before each test method execution goes here.
        System.out.println("-----initBeforeEach-----");
        //This method will run every time, before a test method is called.
        //Some initial data setup or object creation goes here.
    }

    @Test
    void thisIsOneOfTheTestMethod(){
        System.out.println("from test method 1");
        //
    }
    @Test
    void thisIsAnotherTestMethod(){
        System.out.println("from test method 2");
    }
    @Test
    void thisIsYetAnotherTestMethod(){
        System.out.println("from test method 3");
    }

    @AfterEach
    void tearDownAfterEach(){
        //TODO code for some cleanup after each test method execution goes here.

        System.out.println("-----tearDownAfterEach-----");

    }
    @AfterAll
    void tearDownAfterAll(){
        //TODO code for some cleanup after all the test method execution goes here.
        System.out.println("-----tearDownAfterAll-----");
    }

}
