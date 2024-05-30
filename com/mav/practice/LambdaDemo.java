package com.mav.practice;
interface V{
    void show();
}
public class LambdaDemo {
    public static void main(String a[])
    {
        V obj =() -> System.out.println("Void show");
        obj.show();
    }
}
