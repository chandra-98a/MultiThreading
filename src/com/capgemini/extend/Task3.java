package com.capgemini.extend;
import java.util.Scanner;
public class Task3 extends Thread{
    public void run(){
        System.out.println("Enter two numbers to find product");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("product of a*b="+(a*b));
    }
}
