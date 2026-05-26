package com.jsank.corejavapractice.DSA;

public class ReverseString {

    public static String reverseString(String s){

        String reversedstring= "";


        StringBuilder s2 = new StringBuilder(s);

        reversedstring = s2.reverse().toString();


        return reversedstring;

    }



    public static void main(String[] args) {

        System.out.println(reverseString("Hello"));
    }
}
