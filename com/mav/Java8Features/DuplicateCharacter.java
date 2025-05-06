package com.mav.Java8Features;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String input ="programming";

        Map<Character,Long> duplicates =input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        duplicates.entrySet().stream().filter(entry->entry.getValue()>1).forEach(entry->System.out.println(entry.getKey()));

    }
}
