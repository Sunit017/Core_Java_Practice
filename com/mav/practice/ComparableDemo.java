package com.mav.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud> {
    int age;
    String name;

    public Stud(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Stud o) {
        if(this.age > o.age)
        return 1;
        else
            return -1;
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        List<Stud> s= new ArrayList<>();
        s.add(new Stud(13,"ABC"));
        s.add(new Stud(45,"XYZ"));
        s.add(new Stud(34,"RCB"));

        Collections.sort(s);
        for(Stud s1:s)
        System.out.println(s1);
    }


}
