package com.mav.interview;

import java.util.*;

public class Top25InterviewQuestion {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(10,12,22,5,100,13,55,53,10,22);

        System.out.println("Find the first elements of the list using stream");

        num.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Total Number of element present in the list using stream");

        System.out.println(num.stream().count());

        System.out.println("find all even and odd number present in the stream");

        num.stream().filter(n->n%2==0).forEach(System.out::println);
        num.stream().filter(n->n%2!=0).forEach(System.out::println);

        System.out.println("find out all number start with 5");

            num.stream().filter(n->n.toString().startsWith("5")).forEach(System.out::println);

        System.out.println("Find the duplicate element present inside the list");

        Set<Integer> temp =new HashSet<>();
        num.stream().filter(n->!temp.add(n)).forEach(System.out::println);

        System.out.println("Find the max the and min value in stream");

        int max=num.stream().sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(max);

        int min=num.stream().sorted().findFirst().get();
        System.out.println(min);

        System.out.println("Sort the value in Ascending order ");

        num.stream().sorted().forEach(System.out::println);

        System.out.println("Sort the value in Descending order");

        num.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        System.out.println("Check the Array Contains duplicates or not ");

        int [] number={1,2,4,5,1};
        if(Arrays.stream(number).distinct().count()!=number.length)
        {
            System.out.println("It contains duplicate value");
        }
        else {
            System.out.println("It Contains unique value ");
        }

        System.out.println("Square the list of elements and Filter which is greater than 50");

        num.stream().map(n -> n*n).filter(n -> n>50).forEach(System.out::println);

    }
}
