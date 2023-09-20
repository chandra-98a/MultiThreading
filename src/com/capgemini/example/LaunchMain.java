package com.capgemini.example;

public class LaunchMain {
    public static void main(String[] args) throws InterruptedException{
        for (int i=1;i<5;i++){
            for (int j=1;j<i;j++){
                System.out.print("*");
                Thread.sleep(2000);
            }
            System.out.println();
        }
        System.out.println("Thread Information= "+ Thread.currentThread());
    }
}
