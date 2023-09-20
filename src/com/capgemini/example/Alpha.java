package com.capgemini.example;

import java.util.Scanner;

public class Alpha {
    public static void main(String[] args){
        System.out.println("Task-1 activity started");
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Task-1 activity completed");
        System.out.println("Task-2 activity started");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to check number is even or odd");
        int element=scan.nextInt();
        if(element%2==0)System.out.println("element found is even");
        else System.out.println("element found is odd");

        System.out.println("Task-2 Activity completed");
        System.out.println("Task-3 Activity started");

        System.out.println("Enter two numbers to find product");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("product of a*b="+(a*b));
        System.out.println("Task-3 activity completed");


    }
}
