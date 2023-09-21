package com.capgemini.runnable;

public class LaunchMain {
    public static void main(String [] args){
        /*Alpha alpha=new Alpha();
        Beta beta=new Beta();
        Delta delta=new Delta();*/

        Alpha a=new Alpha();
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        Thread t3=new Thread(a);

        t1.setName("Pattern");
        t2.setName("even-odd");
        t3.setName("product");
        t1.start();
        t2.start();
        t3.start();

    }
}
