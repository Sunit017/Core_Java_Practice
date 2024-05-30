package com.mav.practice;
class Bike{
    int price;
    String model;

    public String toString()
    {
        return price+" price"+" "+model+" model";
    }


}

public class ObjectClassDemo {
    public static void main(String a[])
    {
        Bike b =new Bike();
        b.price=20000;
        b.model="Duke";
        System.out.println(b);
    }

}
