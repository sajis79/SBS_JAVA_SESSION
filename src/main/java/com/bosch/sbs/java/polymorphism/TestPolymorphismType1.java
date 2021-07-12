package com.bosch.sbs.java.polymorphism;

public class TestPolymorphismType1 {
    public static void main(String[] args) {
        PolymorphismType1 type1 = new PolymorphismType1();
        int a, b;
        a = b = 10;
        float c, d;
        c = d = 4.5f;
        long m, n;
        m = n = 45L;
        double x, y;
        x = y = 3.56;

        type1.addTwoNumbers(a, b);
        type1.addTwoNumbers(c, d);
        type1.addTwoNumbers(m, n);
        type1.addTwoNumbers(x, y);

    }
}
