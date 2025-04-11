package com.mav.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        list.stream().filter(s-> Collections.frequency(list,s) ==1).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
