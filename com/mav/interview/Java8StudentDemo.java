package com.mav.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StudentDemo {

    public static void main(String[] args) {

        List<Student> students= Arrays.asList(new Student(1,40),
                new Student(2,67),
                new Student(3,89),
                new Student(4,56),
                new Student(5,90));

        System.out.println(" 1 . Sort the Student based upon their mark in desc");

       List<Student> studentMark = students.stream().sorted((o1, o2) -> (o2.getMark()- o1.getMark())).collect(Collectors.toList());
        System.out.println(studentMark);

        System.out.println("Fetch Top 3 ranker student details");

        List<Student> top3Student= students.stream().sorted((o1,o2)->(o2.getMark()-o1.getMark())).limit(3).collect(Collectors.toList());

        System.out.println(top3Student);

        System.out.println("Fetch the Student having less than 3rd highest mark");

        List<Student> less3Mark= students.stream().sorted((o1,o2)->(o2.getMark()-o1.getMark())).skip(3).collect(Collectors.toList());

        System.out.println(less3Mark);
    }
}
