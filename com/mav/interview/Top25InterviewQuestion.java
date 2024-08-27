package com.mav.interview;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Top25InterviewQuestion {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(10,12,22,5,100,13,55,53,10,22);

        System.out.println("(1) Find the first elements of the list using stream");

        num.stream().findFirst().ifPresent(System.out::println);

        System.out.println("(2) Total Number of element present in the list using stream");

        System.out.println(num.stream().count());

        System.out.println("(3) find all even and odd number present in the stream");

        num.stream().filter(n->n%2==0).forEach(System.out::println);
        num.stream().filter(n->n%2!=0).forEach(System.out::println);

        System.out.println("(4) find out all number start with 5");

            num.stream().filter(n->n.toString().startsWith("5")).forEach(System.out::println);

        System.out.println("(5) Find the duplicate element present inside the list");

        Set<Integer> temp =new HashSet<>();
        num.stream().filter(n->!temp.add(n)).forEach(System.out::println);

        System.out.println("(6) Find the max the and min value in stream");

        int max=num.stream().sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(max);

        int min=num.stream().sorted().findFirst().get();
        System.out.println(min);

        System.out.println("(7) Sort the value in Ascending order ");

        num.stream().sorted().forEach(System.out::println);

        System.out.println("(8) Sort the value in Descending order");

        num.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        System.out.println("(9) Check the Array Contains duplicates or not ");

        int [] number={1,2,4,5,1};
        if(Arrays.stream(number).distinct().count()!=number.length)
        {
            System.out.println("It contains duplicate value");
        }
        else {
            System.out.println("It Contains unique value ");
        }

        System.out.println("(10) Square the list of elements and Filter which is greater than 50");

        num.stream().map(n -> n*n).filter(n -> n>50).forEach(System.out::print);

        System.out.println("(11) Java 8 program to sort an array then convert sorted array into Stream");

        Arrays.sort(number);
        Arrays.stream(number).forEach(System.out::println);

        System.out.println("(12) How to use map to convert words into uppercase in java 8");

        List<String> word = Arrays.asList("sunit","kumar","pattnaik","sunit","kumar");

        word.stream().map(w->w.toUpperCase()).forEach(System.out::println);

        System.out.println("(13) Find the maximum element from the array ");

        Arrays.stream(number).max().ifPresent(System.out::println);

        System.out.println("(14) Concatenate two Streams");

        Stream<Integer> s1= Stream.of(1,2,3);
        Stream<Integer> s2 =Stream.of(4,5,6);
        Stream.concat(s1,s2).forEach(System.out::println);

        System.out.println("(15) WAP to print 10 Random value using Stream");

        Random random=new Random();
        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);

        System.out.println("(16) Print date and time using java8");

        LocalDateTime localDateTime=LocalDateTime.now();

        System.out.println(localDateTime);

        System.out.println("(17) The format it in dd-MM-yyyy");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateTimeFormatter.format(localDateTime));

        System.out.println("(18) How to check list is empty using java 8 optional , if not iterate through the list and print object ");

        List<String> list=null;
        Optional<List<String>> optionalList =Optional.ofNullable(list);
        optionalList.ifPresentOrElse(i->i.stream().forEach(System.out::println),()->System.out.println("The list is Empty"));

        System.out.println("(19) In given array , WAP using using java 8 find the number of occurrence of particular value ");

        int []a={10,20,30,100,100,100,};
        int numb = 100;

        long result =Arrays.stream(a).filter(value->value==numb).count();
        System.out.println(result);

        System.out.println("(20) find the duplicate elements with its count from String ArrayList in java8");

        Map<String,Long> map= word.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        map.entrySet().stream().filter(m->m.getValue()>1).forEach(m->System.out.println(m.getKey()+":"+m.getValue()));

        System.out.println("(21) WAP give some of the salary of employee");

        List<Employee> employees= Arrays.asList(new Employee("Sunit",1000),
                new Employee("Kumar",2000),
                new Employee("Papu",3000));

        double sum =employees.stream().mapToDouble(Employee::getSalary).sum();

        System.out.println(sum);

        System.out.println("(22) WAP to print the count of each character in a String using stream");

        String words="Elements";
        Map<Character,Long> dupchar=words.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(dupchar);

        System.out.println("(23) How to convert list object into map by considering duplicated keys and stored into sorted order");

        Map<String,Long> uniqueEmployee = employees.stream()
                .collect(Collectors.toMap(Employee::getName,Employee::getSalary,
                        (existing,replacement)->existing,()-> new TreeMap<>(Comparator.naturalOrder())));

        System.out.println(uniqueEmployee);

        System.out.println("(24) Given a String, find the first non-repeated character in it using Stream functions.");

        String str = "aabbcddef";

        Optional<Character> firstNonRepeatedChar = str.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        () -> new LinkedHashMap<Character, Integer>(), // Specify Integer as value type
                        (map1, ch) -> map1.put(ch, map1.getOrDefault(ch, 0) + 1), // No casting needed
                        LinkedHashMap::putAll
                )
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        firstNonRepeatedChar.ifPresent(System.out::println);


        System.out.println("(25) Find the first unique character in a string using Java streams.");


        String str1 = "aabbcddef";

        Optional<Character> firstUniqueChar = str1.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        () -> new LinkedHashMap<Character, Integer>(),  // Use a LinkedHashMap to maintain insertion order
                        (map2, ch) -> map2.put(ch, map2.getOrDefault(ch, 0) + 1),  // Increment count of each character
                        LinkedHashMap::putAll
                )
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)  // Find the first entry with a count of 1
                .map(Map.Entry::getKey)
                .findFirst();

        firstUniqueChar.ifPresent(System.out::println);  // Prints the first unique character if present


    }
}
