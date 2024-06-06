package com.mav.Map;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable ht= new Hashtable(25); // Hashtable store data from top to button and right yo left
        ht.put(new Demo(5),"A");
        ht.put(new Demo(17),"B");
        ht.put(new Demo(34),"C");
        ht.put(new Demo(2),"D");
        System.out.println(ht);
    }
}
class Demo
{
    int i;
    Demo(int i)
    {
    this.i=i;
    }
    public int hashCode()
    {
        return i;
    }
    public String toString()
    {
        return i+"";
    }
}
