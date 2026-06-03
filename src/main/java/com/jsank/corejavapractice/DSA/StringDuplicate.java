package com.jsank.corejavapractice.DSA;

import java.util.List;

public class StringDuplicate {

    public static void main(String[] args) {
        String first = "abbcd";
        char[] firstArray = first.toCharArray();
        StringBuilder firstUnique = new StringBuilder();

        for(int i=0; i < firstArray.length; i++){
            char c = firstArray[i];
            if (firstUnique.indexOf(String.valueOf(c)) == -1){
                firstUnique.append(c);
            }
        }

        System.out.println(first + " - First; " + firstUnique.toString() + " - Second");
    }
}
