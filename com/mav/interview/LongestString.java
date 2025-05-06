package com.mav.interview;

import java.util.Arrays;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        String [] arr = {"apple", "banana", "cherry", "date", "elderberry"};
        Optional<String> longest= Arrays.stream(arr).max((s1, s2)->Integer.compare(s1.length(),s2.length()));
        longest.ifPresent(s -> System.out.println("Longest string is: " + s));
    }
}
