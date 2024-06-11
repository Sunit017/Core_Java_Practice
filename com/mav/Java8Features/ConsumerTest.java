package com.mav.Java8Features;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> c=s-> System.out.println(s);
        c.accept("Sunit");
    }
}
/* Consumer is functional interface which is having 1 method is accept and return type is void and one parameter
it take */