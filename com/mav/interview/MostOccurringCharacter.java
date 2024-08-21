package com.mav.interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostOccurringCharacter {

    public static void main(String[] args) {

        String str ="javaisthebest";

        str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
               .ifPresent(entry ->System.out.println(entry.getKey()));

    }
}
