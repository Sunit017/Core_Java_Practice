package com.mav.Map;

import java.util.IdentityHashMap;

public class IdentityHashMapEx {
    public static void main(String[] args) {
        IdentityHashMap ih=new IdentityHashMap();
        Integer i1= Integer.valueOf(11);
        Integer i2= Integer.valueOf(10);
        ih.put(i1,"Sunit");
        ih.put(i2,"Kumar");
        System.out.println(ih);
        System.out.println(i1==i2);


    }
}
