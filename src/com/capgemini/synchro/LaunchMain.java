package com.capgemini.synchro;

public class LaunchMain {
    public static void main(String[] args){
        Cricket c1=new Cricket();
        Cricket c2=new Cricket();

        c1.setName("Doni");
        c2.setName("sewag");

        c1.start();
        c2.start();
    }
}
