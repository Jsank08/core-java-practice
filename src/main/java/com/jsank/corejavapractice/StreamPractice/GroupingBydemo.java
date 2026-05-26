package com.jsank.corejavapractice.StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBydemo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "cat", "goat", "camel", "dog", "apple", "goat", "banana", "apple", "banana");

        Map<Integer, List<String>> map = stringList.stream().collect(Collectors.groupingBy(n -> n.length()));

        stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));


    }
}
