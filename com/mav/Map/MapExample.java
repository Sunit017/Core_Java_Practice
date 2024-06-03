package com.mav.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(101,"Sunit");
        m.put(102,"Kumar");
        m.put(103,"Pattnaik");
        System.out.println(m);
        System.out.println(m.put(103,"Sujit"));
        Set s=m.entrySet();
        System.out.println(s);

    }
}
