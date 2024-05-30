package com.mav.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String a[])
    {
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) {
                    return 1;
                } else
                    return -1;
            }
        };

        List<Integer> num =new ArrayList<>();
        num.add(49);
        num.add(81);
        num.add(56);
        num.add(90);

        Collections.sort(num,com);
        for(int n:num)
        System.out.println(n);
    }
}
