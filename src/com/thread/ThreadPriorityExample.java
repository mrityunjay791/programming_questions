package com.thread;
public class ThreadPriorityExample {
     public static void main(final String[] args) {
          final Runnable runnable = () -> {
               System.out.println("Running thread name : " + Thread.currentThread().getName() +  
               " and it's priority : " + Thread.currentThread().getPriority());
   
          };
  
          final Thread thread0 = new Thread(runnable);
          final Thread thread1 = new Thread(runnable);
          final Thread thread2 = new Thread(runnable);
          final Thread thread3 = new Thread(runnable);
          thread0.setPriority(Thread.MIN_PRIORITY);
          thread1.setPriority(Thread.NORM_PRIORITY);
          thread2.setPriority(Thread.MAX_PRIORITY);
          thread3.setPriority(2);
  
          thread0.start();
          thread1.start();
          thread2.start();
          thread3.start();
     }
}