package com.jsank.corejavapractice.StreamPractice;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args){

        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Ankit");
        map.put(6, "Sanket");
        map.put(4, "Rushi");
        map.put(9, "Sarvesh");
        map.put(null, "Mahesh");
        map.put(null, "Mangesh");

        String student = map.get(45);

        boolean isPresent = map.containsValue("Sanket");

//        System.out.println(isPresent);

        Set<Integer> keys = map.keySet();
        System.out.println(map);

//        for(int i: keys){
//            System.out.println(map.get(i));
//        }

        System.out.println(map.values());

         Set<Map.Entry<Integer, String>> entries = map.entrySet();

         for (Map.Entry<Integer, String> i: entries){
             System.out.println(i.getValue().toUpperCase());
         }

        List<Integer> list = Arrays.asList(2, 5, 7, 13);
        System.out.println(list);

    }
}
