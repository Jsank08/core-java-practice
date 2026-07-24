package com.jsank.corejavapractice.EY;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String str){

        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, maxLength = 0;

        for (right = 0; right < str.length(); right++){

            char ch = str.charAt(right);

            if(map.containsKey(ch)){
                left = map.get(ch) + 1;

            }

            map.put(ch, right);

            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;


    };

    public static int setLongestSubstring(String str){
        Set<Character> charSet = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            while (charSet.contains(ch)){
                charSet.remove(ch);
                left++;
            }

            charSet.add(ch);

            maxLength = Math.max(maxLength, i - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int length = setLongestSubstring(str);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}
