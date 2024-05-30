package com.mav.collection;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet(new MyComparator());
        ts.add(10);
        ts.add(0);
        ts.add(5);
        ts.add(15);
        ts.add(20);

        System.out.println(ts);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        Integer l1=(Integer) obj1;
        Integer l2=(Integer) obj2;

        if(l1>l2)
            return -1;
        else if (l1<l2) {
          return +1;
        }
        else
            return 0;

    }
}
