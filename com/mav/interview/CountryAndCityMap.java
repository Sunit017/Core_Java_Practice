package com.mav.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryAndCityMap {

    public static void main(String[] args) {
        Map<String , List<String>> countryCites= new HashMap<>();
        countryCites.put("India", Arrays.asList("Delhi", "Mumbai", "Bangalore"));
        countryCites.put("USA", Arrays.asList("New York", "Los Angeles", "Chicago"));
        countryCites.put("UK", Arrays.asList("London", "Manchester", "Birmingham"));


    }
}
