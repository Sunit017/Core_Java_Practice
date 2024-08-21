package com.mav.Java8Features;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ExampleStreamGenerate {
    public static void main(String[] args) {

        Supplier <String> supplier=new Supplier<String>() {
            @Override
            public String get() {
                return "This is the Stream of Strings";
            }
        };
        Consumer<String> consumer=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
       Stream<String> stringStream= Stream.generate(supplier);
       stringStream.forEach(consumer);
    }
}
