package com.mav.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add('A');
        lhs.add('B');
        lhs.add('C');
        lhs.add(null);
        System.out.println(lhs);
    }
}
