package com.capgemini.daemon;

import com.capgemini.accountholder.AccountHolder;

public class MSword implements Runnable{
    public void run(){
        if(Thread.currentThread().getName().equals("Typing"))
            typing();
        else if (Thread.currentThread().getName().equals("spellCheck")) {
            spellCheck();
        }
            else autoSaving();
        }
        public void typing(){
        for (int i=1;i<5;i++) {
            System.out.println("typing started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
    public void spellCheck(){
        for (int i=1;i<5;i++){
            System.out.println("spell checked");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }

        }
    }
    public void autoSaving(){
        for (int i=1;i<5;i++){
            System.out.println("autosaving ");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }
            System.out.println("typing completed");
        }
    }
}
