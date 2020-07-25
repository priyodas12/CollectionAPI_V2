package test;

import java.util.List;


public class Consumer implements Runnable{

    public List<String> sharedList;
    public int maxSize;

    public Consumer(List<String> sharedList, int maxSize) {
        this.sharedList = sharedList;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (sharedList){
                while(sharedList.size()==0){
                    try {
                        sharedList.wait();
                        System.out.println("Container is Empty! ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(sharedList);
                for (int i=0;i<sharedList.size();i++){
                    Object o=sharedList.get(i);
                    System.out.println(sharedList.get(i)+" removed from container position "+i);
                    sharedList.remove(o);
                    sharedList.notify();
                }

            }
        }

    }
}
