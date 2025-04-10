package com.mav.interview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovingZeroElementToRight {

    public static void main(String[] args) {
        List<Integer> numbers=List.of(0,1,0,3,12);

        List<Integer> moveZeoElement= Stream.concat(numbers.stream().filter(i->i!=0),numbers.stream().filter(i->i==0)).collect(Collectors.toList());
        System.out.println(moveZeoElement);
    }
}
