package com.bosch.sbs.java.method;

public class PassByReference {
    //this is for object types
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7};
        System.out.println("---------------------Initially.");
        for (int x: intArr) {
            System.out.print(x);
            System.out.print(",");
        }

        changeValue(intArr);
        System.out.println("---------------------After calling changeValue.");
        for (int y :intArr) {
            System.out.print(y);
            System.out.print(",");
        }


    }


    public static int[] changeValue(int[] arrayInt){
        System.out.println("---------------------Inside changeValue method.");
        for(int i=0;i<arrayInt.length;i++){
            arrayInt[i]=2*i;
        }

        for (int x:arrayInt) {
            System.out.print(x);
            System.out.print(",");
        }
        return arrayInt; //*Don't return and check
    }
    //One of the way to return multiple object types
}
