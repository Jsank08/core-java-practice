package com.jsank.corejavapractice.StreamPractice;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlattenNestedArray {

    public static Stream<Object> flattenArray(Object[] array){

        return Stream.of(array).flatMap(obj -> {
            if (obj instanceof Object[]){
                return flattenArray((Object[]) obj);
            }
            return Stream.of(obj);
        });
    }


    public static void main(String[] args) {
        Object[] array = {
                1,
                2,
                new Object[]{
                        3,
                        4,
                        new Object[]{5},
                        6,
                        7
                }
        };

        System.out.println(Arrays.toString(flattenArray(array).toArray()));
    }
}
