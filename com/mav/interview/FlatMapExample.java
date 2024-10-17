package com.mav.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {

        List<List<String>> skills= Arrays.asList(
                Arrays.asList("Java","Spring","SpringBoot"),
                Arrays.asList("React","Angular","JavaScript"),
                Arrays.asList("Mysql","PostGres","Oracle")
        );

        List<String> collect = skills.stream().flatMap(skillList -> skillList.stream()).collect(Collectors.toList());
        System.out.println(collect);

        List<String> s = collect.stream().filter(c -> c.startsWith("S")).collect(Collectors.toList());

        System.out.println(s);
    }
}
