package com.mav.practice;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SetCollectionDemo {
    public static void main(String a[])
    {
        Set<Integer> hs = new HashSet<Integer>();
        hs.add(9);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(7);

        for(Integer i:hs)
        System.out.println(i);
    }
}