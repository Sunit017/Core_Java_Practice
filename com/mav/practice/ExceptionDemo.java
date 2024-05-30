package com.mav.practice;

public class ExceptionDemo {

    public static void main(String a[])
    {
        int i =0;
        int j =2;
        int l[]=new int[5];

        try{
            j = i / j;
            System.out.println(l[4]);
        }
        catch (Exception e)
        {
            System.out.println("Exception" + e);
        }
        System.out.println("Bye");

    }

}
