package com.capgemini.synchro;

public class Cricket extends Thread {
    String resource1 = "Ball";
    String resource2 = "Bat";
    String resource3 = "wickets";

    public void run() {
        if (Thread.currentThread().getName().equals("doni"))
            doniAcqirredResources();
        else
            sewagAcquirredResources();
    }


    public void doniAcqirredResources() {
        synchronized (resource1) {
            System.out.println("doni has acquirred " + resource1 + " resource ");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
            synchronized (resource2) {
                System.out.println("doni has acquirred " + resource2 + " resource ");
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                }
                synchronized (resource3) {
                    System.out.println("doni has acquirred " + resource3 + " resource ");
                    try {
                        Thread.sleep(3000);
                    } catch (Exception e) {
                    }
                }
                System.out.println("doni has released " + resource3 + " resource");
            }
            System.out.println("doni has released " + resource2 + " resource");
        }
        System.out.println("doni has released " + resource1 + " resource");
    }

    public void sewagAcquirredResources() {
        synchronized (resource1) {
            System.out.println("sewag has acquirred " + resource1 + " resource ");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

                synchronized (resource2) {
                    System.out.println("sewag has acquirred " + resource2 + " resource ");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {

                    }
                    synchronized (resource3) {
                        System.out.println("sewag has acquirred " + resource3 + " resource ");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                        }
                    }
                    System.out.println("sewag has released " + resource3 + " resource");
                }
                System.out.println("sewag has released " + resource2 + " resource");
            }
            System.out.println("sewag has released " + resource1 + " resource");
        }
    }
