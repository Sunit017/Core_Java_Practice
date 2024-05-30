package com.mav.practice;
@FunctionalInterface
interface X{
    void show();
}
public class FunctionalInterfaceDemo {
    public static void main(String a[]) {
        X obj = new X() {
            public void show() {
                System.out.println("In Innerclass");
            }
        };
        obj.show();
    }
}
