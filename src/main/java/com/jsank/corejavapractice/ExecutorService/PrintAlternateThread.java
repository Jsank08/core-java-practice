package com.jsank.corejavapractice.ExecutorService;

import lombok.Getter;

class Counter {
    @Getter
    int count = 0;
    int turn = 0;
    int threadCount;

    public Counter( int threadCount) {
        this.threadCount = threadCount;
    }

    public synchronized void increment(int threadId) throws InterruptedException{
        while(turn % threadCount != threadId){
           wait();
        }

        System.out.println(Thread.currentThread().getName() + " - " + count + " turn - " + threadId);
        count++;
        turn++;
        notifyAll();
    }

}
public class PrintAlternateThread {
    public static void main(String[] args) {
        int THREAD_COUNT = 3;

        Counter counter = new Counter(THREAD_COUNT);

        Thread task1 = new Thread((() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    counter.increment(0);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }));

         Thread task2 = new Thread((() -> {
             for (int i = 0; i < 3; i++) {
                 try {
                     counter.increment(1);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
        }));

         Thread task3 = new Thread((() -> {
             for (int i = 0; i < 3; i++) {
                 try {
                     counter.increment(2);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         }));

         task1.start();
         task2.start();
         task3.start();

         try{
                task1.join();
                task2.join();
                task3.join();
        } catch(InterruptedException e){

        }

    }
}
