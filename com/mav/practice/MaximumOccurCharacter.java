package com.mav.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaximumOccurCharacter {

    public static void main(String[] args) {
        List<String> list=Arrays.asList("a","b","c","a","b","a","c","b","b");

        Map<String,Long> charFrequency=list.stream().
                collect(Collectors.groupingBy(str ->str,Collectors.counting()));

        Map.Entry<String,Long> result= charFrequency.entrySet().stream().
                max(Map.Entry.comparingByValue()).get();

        System.out.println(result);
    }
}
