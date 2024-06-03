package com.mav.Map;

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap wm=new WeakHashMap<>();
        Temp t=new Temp();
        wm.put(t,"Sunit");
        System.out.println(wm);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(wm);
    }
}
class Temp{
    public String toString()
    {
        return "temp";
    }
    public void finalize()
    {
        System.out.println("Finalize Method Called ");
    }
}
