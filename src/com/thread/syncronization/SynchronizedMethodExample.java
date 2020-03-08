package com.thread.syncronization;
      // This program is not synchronized. you can use synchronized with method to syncronized.
     class Callme {
    	  void  call(final String msg) {
    		  //synchronized(this) {
               System.out.print("[" + msg);
               try {
                   Thread.sleep(1000);
               } catch (final InterruptedException e) {
                    System.out.println("Interrupted");
               }
              System.out.println("]");
    		  //}
         }   
    }

class Caller implements Runnable {
     protected String msg;
     protected Callme target;
     protected Thread t;

     public Caller(final Callme targ, final String s) {
         target = targ;
         msg = s;
         t = new Thread(this);
         t.start();
     }

     @Override
      public void run() {
    	target.call(msg);
     }
}

public class SynchronizedMethodExample {
     public static void main(final String args[]) {
          final Callme target = new Callme();
          final Caller ob1 = new Caller(target, "Hello");
          final Caller ob2 = new Caller(target, "Synchronized");
          final Caller ob3 = new Caller(target, "World");
          // wait for threads to end
           try {
               ob1.t.join();
               ob2.t.join();
               ob3.t.join();
           } catch (final InterruptedException e) {
               System.out.println("Interrupted");
           }
     }
}