package com.mav.Java8Features;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ExampleStreamOf {

    public static void main(String[] args) {

        Consumer<Integer> consumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        Stream<Integer> streamOfData=Stream.of(1,2,3,4,5,6,7,8,9);
        streamOfData.forEach(consumer);
    }
}
