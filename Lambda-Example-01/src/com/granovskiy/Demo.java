package com.granovskiy;

public class Demo {

    public static void main(String []args) {
        NumericTest isEven = (n) -> (n%2) == 0;
        NumericTest isNegative = (n) -> (n < 0);

        System.out.println(isEven.computeTest(5));
        System.out.println(isEven.computeTest(6));
        System.out.println(isNegative.computeTest(3));
        System.out.println(isNegative.computeTest(-3));
    }
}
