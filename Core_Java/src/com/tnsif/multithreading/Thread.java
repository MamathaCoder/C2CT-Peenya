package com.tnsif.multithreading;

//demo for extending thread class

class Eclipse extends Thread{
     public void run() { // step 3
             System.out.println("Eclipse id"+" "+Thread.currentThread().getId());
     }
}
class Onenote extends Thread{
     public void run() {
             System.out.println("Onenote"+" "+Thread.currentThread().getId());
     }
}
class Chrome extends Thread{
     public void run() {
             System.out.println("Chrome"+" "+Thread.currentThread().getId());
     }
}

public class ExtendingThread {
public static void main(String[] args) {
     Eclipse e=new Eclipse(); // object creation
     e.start();//step 2
     
     Onenote o=new Onenote();
     o.start();
     
     Chrome c=new Chrome();
     c.start();
     
     //for(int i=0;i<5;i++) {
             System.out.println("main thread"+" "+Thread.currentThread().getId());
     //}
}
}
