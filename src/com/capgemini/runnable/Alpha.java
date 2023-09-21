package com.capgemini.runnable;

import java.util.Scanner;

public class Alpha implements Runnable{
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Pattern"))
            pattern();
        else if(Thread.currentThread().getName().equals("product"))
        product();
        else
        findEvenOdd();
    }
    public void pattern(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void product(){
        System.out.println("Enter two numbers to find product");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("product of a*b="+(a*b));
    }
    public void findEvenOdd(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check number is even or odd");
        int element = scan.nextInt();
        if (element % 2 == 0) System.out.println("element found is even");
        else System.out.println("element found is odd");
    }
}
