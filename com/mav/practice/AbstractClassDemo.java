package com.mav.practice;

abstract class  Car{
     abstract void Driver(); // in abstract we can declare the method not define
    public void PlayMusic(){
        System.out.println("Playing Music");
    }
}
class BMW extends  Car  // Concrete class
{
    @Override
    public void Driver() {
        System.out.println("Driving");
    }
}


public class AbstractClassDemo {

    public static void main(String a[])
    {
        Car c=new BMW();
        c.Driver();
        c.PlayMusic();
    }
}
