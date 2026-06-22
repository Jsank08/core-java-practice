package com.jsank.corejavapractice.StreamPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        Iterator<String> iterator = list.iterator();

        if (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("First element: " + element);
            if (iterator.next().equals("Python")){
                iterator.remove();
            }
        }




    }
}
