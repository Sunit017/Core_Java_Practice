package com.mav.collection;

import java.util.LinkedList;

public class LinkListExample {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("durga");
        l.add(30);
        l.add(null);
        l.add("durga");
        l.set(0,"Software");
        l.add(0,"Sunit");
        l.removeLast();
        l.addFirst("CCC");
        System.out.println(l);
    }
}
