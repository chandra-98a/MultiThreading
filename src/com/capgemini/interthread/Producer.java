package com.capgemini.interthread;

public class Producer implements Runnable{
    private BucketQueue bq;
    public Producer(BucketQueue bq){
        this.bq=bq;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            bq.put(i);
            System.out.println("Producer "+Thread.currentThread().getName()+" has put "+i);
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){

            }
        }
    }
}
