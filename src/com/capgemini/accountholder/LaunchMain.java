package com.capgemini.accountholder;

public class LaunchMain {
    public static void main(String[] args){
        Account account=new Account();
        AccountHolder accountHolder=new AccountHolder(account);

        Thread t1=new Thread(accountHolder,"yogi");
        Thread t2=new Thread(accountHolder,"yathish");
        t1.start();
        t2.start();
    }
}
