package com.tnsif.multithreading;

public class Tsych {
public static void main(String[] args) {
        
        Example e=new Example();
        
        T t1=new T(e);
        T t2=new T(e);
        T t3=new T(e);
        
        t1.start();
        t2.start();
        t3.start();
}
}
