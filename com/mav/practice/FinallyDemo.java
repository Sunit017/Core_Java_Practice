package com.mav.practice;

public class FinallyDemo {
    public static void main(String a[])
    {
        int i =0;
        int j=0;
        try{
            i =i/j;
        }
        catch (Exception e){
            System.out.println("Something Went Wrong");
        }
        finally {
            System.out.println("Bye"); // finally block will execute irrespective of there is exception or not
        }
    }
}
