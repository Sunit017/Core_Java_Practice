package com.mav.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharFromString {

    public static void main(String[] args) {
        String input ="gainjavaknowlegde";

        Map<Character, Long> duplicates = input.chars() //Converts the string into an IntStream of character codes
                .mapToObj(c->(char)c) // Converts each integer (character code) into its corresponding char
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))//Groups characters by their identity
                // (i.e., the character itself) and counts the occurrences of each character.
                .entrySet().stream() // Convert to stream of map entries
                .filter(entry ->entry.getValue()>1) //Filters the entries to keep only those with a count greater than 1 (duplicates).
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)); // // Collect to a map


        duplicates.forEach((k,v)->System.out.println("Character: "+k+ ",Count : "+v));

    }
}
