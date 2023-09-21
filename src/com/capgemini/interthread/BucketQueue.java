package com.capgemini.interthread;

public class BucketQueue {
    int count;
    public void put(int value){
        count=value;
    }
    public int get(){
        return count;
    }
}
