package queue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/*
LinkedBlockingQueue creates nodes dynamically until the capacity is reached.
This is by default Integer.MAX_VALUE. Using such a big capacity has no extra costs in space.
LinkedBlockingQueue is optionally bounded.
High Throughput
*/

public class LinkedBlockingQueueImpl {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue=new LinkedBlockingQueue<>();

        final Runnable producer=() -> {
            while(true){
                try {
                    Thread.sleep(2000);
                    Integer i= new Random().nextInt();
                    System.out.println(i+" pushed by"+Thread.currentThread().getName());
                    blockingQueue.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        final Runnable consumer=() -> {
            while(true){
            try {
                Thread.sleep(2000);
                Integer i=blockingQueue.take();
                System.out.println(i+" picked by"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }};

        new Thread(producer).start();
        //new Thread(producer).start();
        new Thread(consumer).start();
        //new Thread(consumer).start();
    }
}
