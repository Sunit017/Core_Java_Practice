package com.mav.Map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm =new TreeMap(); // create an empty treemap with default natural sorting order
        tm.put(101,"ABC");
        tm.put(102,"XYZ");
        tm.put(103,"TYU");
        tm.put(104,105); // duplicate values are allowed

        System.out.println(tm);
        //tm.put("DFR","UYT"); // if we insert this we will get class cast exception because we are changing the key

    }
}
