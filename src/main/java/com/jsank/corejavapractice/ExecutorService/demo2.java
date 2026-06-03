package com.jsank.corejavapractice.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class demo2 {
    public static void main(String[] args) {
        //future and callable

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> f1 = executor.submit(() -> 10);
        try{
            System.out.println(f1.get());
        } catch (Exception e){

        }

        executor.shutdown();
    }
}
