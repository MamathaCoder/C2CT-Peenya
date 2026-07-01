package com.tnsif.multithreading;
//demo for runnable interface

class Eclipse1 implements Runnable{

     @Override
     public void run() {
             for(int i=0;i<3;i++) {
                     System.out.println("Eclipse"+" "+Thread.currentThread().getId());
             }
     }
}
public class ImplementsRunnable {
public static void main(String[] args) {
     Eclipse1 e=new Eclipse1(); //step 1
     
     Thread obj=new Thread(e);
     
     obj.start();
     System.out.println("Main id"+" "+Thread.currentThread().getId());
}
}
