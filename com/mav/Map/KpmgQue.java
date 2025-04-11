package com.mav.Map;

import java.util.HashMap;

public class KpmgQue {

    public static void main(String[] args) {
        HashMap<String ,Integer> map=new HashMap<>();
        map.put("one",1);
        map.put("one",2);
        int size =map.size();
        System.out.println("Size of the map: " + size);
        System.out.println(map);

    }
}
