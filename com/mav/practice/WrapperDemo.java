package com.mav.practice;

public class WrapperDemo {
    public static void main(String a[])
    {
        int n1=2;
        Integer n2= n1; /* Auto -boxing ==> Assign primitive type into Object type */

        int n3= n2.intValue(); /* Auto -Unboxing ==> get the primitive data from Wrapper Object */

        System.out.println(n3);

    }
}
