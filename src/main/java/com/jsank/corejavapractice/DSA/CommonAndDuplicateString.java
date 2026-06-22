package com.jsank.corejavapractice.DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonAndDuplicateString {

    public static void main(String[] args) {
        String s1 = "abbccd";
        String s2 = "bccdde";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i <  arr1.length; i++){
            char c = arr1[i];
            if (map1.containsKey(c)){
                Integer val = map1.get(c);
                map1.put(c, val + 1);
            } else {
                map1.put(c, 1);
            }
        }

        for(int i = 0; i <  arr2.length; i++){
            char c = arr2[i];
            if (map2.containsKey(c)){
                Integer val = map2.get(c);
                map2.put(c, val + 1);
            } else {
                map2.put(c, 1);
            }
        }

        Set<Character> commonChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

        for(Character c : map1.keySet()){
            if (map2.containsKey(c)){
                commonChars.add(c);
            }
            if (map1.get(c) > 1){
                duplicateChars.add(c);
            }
        }
    }
}
