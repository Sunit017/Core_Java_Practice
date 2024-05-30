package com.mav.collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet h=new HashSet<>();
        h.add("A");
        h.add(null);
        h.add(5);
        h.add('A');
        System.out.println(h.add("A"));
        System.out.println(h);
    }
}
