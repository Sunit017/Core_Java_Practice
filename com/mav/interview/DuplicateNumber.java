package com.mav.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
       Set<Integer> dup= num.stream().filter(e-> Collections.frequency(num,e)>1).collect(Collectors.toSet());
       System.out.println(dup);
    }
}
