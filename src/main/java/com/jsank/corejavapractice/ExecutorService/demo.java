package com.jsank.corejavapractice.ExecutorService;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++){
            int taskId = i;
            executorService.execute(() -> {
                System.out.println(" Task : " + taskId + ", thread running is : " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
        System.out.println("Hello");
    }
}
