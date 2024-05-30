package com.mav.practice;

enum Weekday{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY;
}
public class EnumDemo {
    public static void main(String a[]) {
        Weekday w = Weekday.MONDAY;
        System.out.println(w);
    }
}
