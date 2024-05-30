package com.mav.practice;
class Fruit{
    public void work(){
        System.out.println("Working ...");
    }
    class Apple{
        public void innerWork(){
            System.out.println("Inner class Work");
        }
    }
}

public class InnerclassDemo {
    public static void main(String a[])
    {
        Fruit f= new Fruit();
        f.work();

       Fruit.Apple apple =f.new Apple();
       apple.innerWork();
    }
}
