package com.capgemini.interthread;



public class Launch {
    public static void main(String [] args){
        BucketQueue bq=new BucketQueue();

        Consumer c=new Consumer(bq);
        Producer p=new Producer(bq);
        Thread t1=new Thread(p,"john");
        Thread t2=new Thread(c,"mars");
        t1.start();
        t2.start();


    }
}
