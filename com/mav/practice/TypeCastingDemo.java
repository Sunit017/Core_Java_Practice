package com.mav.practice;

class A{
    public void show()
    {
        System.out.println("class A");
    }

}
class B extends A{
    public void show1()
    {
        System.out.println("class B");
    }
}
public class TypeCastingDemo {
    public static void main(String a[])
    {
        A obj= (A) new B(); /* Up casting going Up from sub class to super class */
        obj.show();

        B obj1= (B) obj; /* Down casting */
        obj1.show1();

    }
}
