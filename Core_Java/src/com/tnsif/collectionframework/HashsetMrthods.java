package com.tnsif.collectionframework;
import java.util.HashSet;
//demo for hash set

public class HashsetMrthods {
     public static void main(String[] args) {
             HashSet<Integer> s=new HashSet<>();
             //add()
             s.add(1);
             s.add(null);
             s.add(9);
             s.add(10);
             s.add(199);
             s.add(12);
             s.add(1);
             
             System.out.println(s);
             
             //size()
             System.out.println(s.size());
             System.out.println(s.contains(80));
             s.remove(199);
             System.out.println(s);
             
             //addAll()
             
             HashSet<Integer> s2=new HashSet<>();
             s2.add(70);
             s2.add(680);
             s2.add(770);
             s2.add(710);
             s2.add(70);
             s.addAll(s2);
             System.out.println(s);
             
             s.remove(s2);
             System.out.println(s);
             
             System.out.println(s.isEmpty());
     }

}
