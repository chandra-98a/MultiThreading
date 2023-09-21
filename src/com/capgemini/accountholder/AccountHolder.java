package com.capgemini.accountholder;

public class AccountHolder implements Runnable{
    private Account account;
public AccountHolder(Account account){
    this.account=account;
}

public void run(){
    for (int i=1;i<=4;i++){
        makeWithdraw(2000);
        if(account.getBalance()<0){
            System.out.println("Amount in account is overdrawn");
        }
    }
}
public synchronized void makeWithdraw(int amount) {
    if (account.getBalance() >= amount) {
        System.out.println("Account requested by " + Thread.currentThread().getName()+ "is going to withdraw amount of rupees " + amount);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted due to " + e);
        }
        account.withdraw(amount);
        System.out.println(Thread.currentThread().getName() + " completed withdrawal of rupees " + amount);
    } else {
        System.out.println("Not enough amount for " + Thread.currentThread().getName() + " to withdraw \n Balance= " + account.getBalance());
    }
}
}

