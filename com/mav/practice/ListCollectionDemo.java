package com.mav.practice;

import java.util.ArrayList;
import java.util.List;

public class ListCollectionDemo {
    public static void main(String a[])
    {
        List<Integer> num=new ArrayList<Integer>();
        // duplicates are allow , insertion order are preserved
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(8);
        for(Integer n:num)
        System.out.println(n);
    }

}
