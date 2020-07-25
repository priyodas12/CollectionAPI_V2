package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestApplication {
    public static void main(String[] args) {
        //int maxSize=10;
        List<String> sharedList=new ArrayList<>();


        Thread t1=new Thread(new Producer(sharedList,10));
        Thread t2=new Thread(new Consumer(sharedList,10));

        t1.start();
        t2.start();

    }
}
