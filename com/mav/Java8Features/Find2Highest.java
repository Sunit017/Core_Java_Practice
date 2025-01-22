package com.mav.Java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find2Highest {
    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(10,20,40,2,4,6,8,9);

        int result= num.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();

        System.out.println(result);
    }
}
