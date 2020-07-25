package test;

import java.util.List;
import java.util.Random;


public class Producer implements Runnable {

    public List<String> sharedList;
    public int maxSize;

    public Producer(List<String> sharedList, int maxSize) {
        this.sharedList = sharedList;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
      while(true){
          synchronized (sharedList){
              while(sharedList.size()==maxSize){
                  try {
                      sharedList.wait();
                      System.out.println("Container is Full");
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
              String topic=""+new Random().nextInt();
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

                  sharedList.add(topic);
                  System.out.println(topic+" Added in container");
                  sharedList.notify();

          }
      }
    }
}
