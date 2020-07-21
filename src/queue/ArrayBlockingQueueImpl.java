package queue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/*
ArrayBlockingQueue is backed by an array that size will never change after creation.
Setting the capacity to Integer.MAX_VALUE would create a big array with high costs in space.
ArrayBlockingQueue is always bounded.
*/

public class ArrayBlockingQueueImpl {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<>(10);

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
