package com.mav.practice;

interface  Bus{
    void run();
    void brake();
}
interface Truck extends Bus{
    void engine();
}
class Volvo implements Bus,Truck{
    public void run()
    {
        System.out.println("Bus Run");
    }
    public void brake()
    {
        System.out.println("break apply");
    }
    public void engine()
    {
        System.out.println("Engine work");
    }
}

public class InterfaceDemo {
    public static void main(String a[])
    {
        Bus b=new Volvo();
        b.brake();
        b.run();

    }
}
