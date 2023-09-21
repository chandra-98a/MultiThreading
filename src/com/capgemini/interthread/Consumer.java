package com.capgemini.interthread;

public class Consumer implements Runnable{
    private BucketQueue bq;

    public Consumer(BucketQueue bq){
        this.bq=bq;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            int value=bq.get();
            System.out.println("consumer "+Thread.currentThread().getName()+" has consumed "+ value);

        }
    }
}
