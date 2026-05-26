package com.jsank.corejavapractice.StreamPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean, List<Integer>> partedList = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(partedList.get(false));

        List<Integer> list2 = List.of(11,22,33,44,55,66,77,88);

        Stream<Integer> stream1 = list.stream();
        Stream<Integer> stream2 = Stream.of(11,12,13);
        String[] nums = {"San", "Man", "Fan", "Tan", "Ban"};
        Stream<String> stream3 = Arrays.stream(nums);
        Stream<String> stream5 = Stream.of(nums);


        //square of numbers
        List<Integer> listSquare  = list.stream().map(i -> i = i * i).collect(Collectors.toList());

        //greater than 10 and first number

        int[] listOfNums = {3,7,12,6,14,20,8,2};

        Integer num = Arrays.stream(listOfNums).boxed().filter(i -> i > 10).sorted(Comparator.reverseOrder()).findFirst().orElse(0);

        List<Integer> numCount = Arrays.asList(2,3,9,7,4,6,8,11,23);

        long count = numCount.stream().filter(n -> n > 5).count();

        Optional<Integer> sumOfNums = numCount.stream().reduce((a,b) -> Integer.max(a,b));


        //sum of square of even numbers
        Optional<Integer> sumOfSquareOfEven = list.stream().filter(n -> n % 2 == 0).map(s -> s * s).reduce((a,b) -> a + b);

//        System.out.println(sumOfSquareOfEven.get());

        //Distinct element

        List<Integer> duplicateList = Arrays.asList(11, 5,2,11, 8,2,3,5,9,3);

        HashSet<Integer> noDuplicate = new HashSet<>(duplicateList);

        List<Integer> distinctNums = duplicateList.stream().distinct().toList();

        //average
        List<Integer> numbers = Arrays.asList(5,10,15,20,25);

        OptionalDouble averageOfNum = numbers.stream().mapToInt(Integer::intValue).average();


//        System.out.println(averageOfNum.getAsDouble());


        //work with STRINGS

        List<String> str = Arrays.asList("Apple", "Banana", "Orange", "Apricot", "Mango", "Beet", "Avocado");

        List<String> startA = str.stream().filter(s1 -> s1.startsWith("B")).toList();

        String joinedStr = str.stream().collect(Collectors.joining(","));

        System.out.println("String : " + joinedStr);


        //Flatten list

        List<List<Integer>> listOfList = Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(11,12,13,14),
                Arrays.asList(21,22,23,24),
                Arrays.asList(31,32,33,34)
        );

        List<Integer> flattenList = listOfList.stream().flatMap(arr -> arr.stream()).toList();

        System.out.println(flattenList);

    }
}
