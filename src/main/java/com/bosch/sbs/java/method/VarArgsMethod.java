package com.bosch.sbs.java.method;

public class VarArgsMethod {

    public static void acceptVarArgs(int...v){
        System.out.println("\nnumber of arguments passed = " + v.length);
        for (int i:v) {
            System.out.print(i);
            System.out.print(",");
        }
    }

    public static void main(String[] args) {
        acceptVarArgs(1);
        acceptVarArgs(1,2,3,4,5);
        acceptVarArgs(1,2,3);
        acceptVarArgs(1,2,3,4,5,6,7,8,9);

        //Below are forbidden
        //1. more than one var args in one method
        //Ex public void methoda(int ... a, float ... b)
        //2. var args should be the last argument
        //Ex. public void methodb(int ... a, int b)
    }
}
