package com.capgemini.daemon;

public class Launch {
    public static void main (String[] args) {
        MSword mw = new MSword();
        Thread t1 = new Thread(mw, "typing");
        Thread t2 = new Thread(mw, "spellCheck");
        Thread t3 = new Thread(mw, "autoSaving");

//t2.setPriority(2);
        t1.start();
       // t2.setDaemon(true);
      t2.start();
        t3.start();
//        for (;;);

    }
}
