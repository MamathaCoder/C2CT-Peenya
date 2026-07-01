package com.tnsif.collectionframework;

mport java.util.ArrayList;

//demo for arraylist
public class Arralistdemo {
     public static void main(String[] args) {
             ArrayList al=new ArrayList();
             
             al.add(2);
             al.add("banana");
             al.add(9.0);
             al.add('d');
             
             System.out.println(al);
             
     //        al.clear();
             System.out.println(al);
             al.getFirst();
             System.out.println(al);
             al.set(3, "cherry");
             System.out.println(al);
     }

}
