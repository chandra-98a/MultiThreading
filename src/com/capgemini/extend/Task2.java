package com.capgemini.extend;

import java.util.Scanner;

public class Task2 extends Thread{
    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check number is even or odd");
        int element = scan.nextInt();
        if (element % 2 == 0) System.out.println("element found is even");
        else System.out.println("element found is odd");
    }
}
