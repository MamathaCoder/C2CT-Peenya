package com.tnsif.collectionframework;

import java.util.List;
import java.util.Vector;

public class Vectordemo {
public static void main(String[] args) {
        List<Integer> number=new Vector<>();
        
        number.add(2);
        number.add(9);
        number.add(3);
        number.add(8);
        number.add(7);
        number.add(2);
        number.add(2);
        
        System.out.println(number);
        System.out.println(number.get(4));
        System.out.println(number.getFirst());
        System.out.println(number.contains(7));
        
        number.remove(Integer.valueOf(7));
        System.out.println(number);
        
        number.size();
        System.out.println(number);
        
        number.clear();
        System.out.println(number);
}
}
