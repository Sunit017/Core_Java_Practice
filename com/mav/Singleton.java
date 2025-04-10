package com.mav;
public class Singleton {
    public static void main(String[] args) {
        ABC obj1= ABC.getInstance();
        ABC obj2= ABC.getInstance();
        if(obj1==obj2)
        {
            System.out.println("SingleTon");
        }
    }
}
class ABC
{
    static ABC obj=new ABC();
    private ABC(){
    }
    public static ABC getInstance()
    {
        return obj;
    }
}
