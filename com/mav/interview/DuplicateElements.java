package com.mav.interview;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {

        List<String> listWithDuplicateElements= Arrays.asList("Nothing", "is","Impossible","Programming","is","Impossible");

        Set<String> uniqueItems=new HashSet<>();
        //Set Collection
       // Set<String> duplicates=listWithDuplicateElements.stream().filter(item->!uniqueItems.add(item)).collect(Collectors.toSet());
        //Collections.frequency()
        Set<String> duplicates=listWithDuplicateElements.stream().filter(item->Collections.frequency(listWithDuplicateElements,item)>1)
                        .collect(Collectors.toSet());
        duplicates.stream().forEach(System.out::println);

       // System.out.println(duplicates);

    }
}
