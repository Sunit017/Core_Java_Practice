package com.mav.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(20);
        l.add(23);
        l.add(45);
        List<Integer> l1= l.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(l1);
    }
}
