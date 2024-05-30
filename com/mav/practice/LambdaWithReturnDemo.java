package com.mav.practice;

interface  J{
    int add(int i,int j);
}
public class LambdaWithReturnDemo {
    public static void main(String a[])
    {
        J obj =( i, j)-> i+j;

        int result = obj.add(5,4);
        System.out.println(result);

    }

}
