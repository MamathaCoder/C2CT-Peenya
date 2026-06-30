package com.tnsif.collectionframework;

import java.util.HashMap;
import java.util.Map;

// demo for Hash map

public class HashMapdemo {
public static void main(String[] args) {
        
        HashMap<Integer , Integer> map=new HashMap<>();
        map.put(1, 100);
        map.put(2, 800);
        map.put(3, 1400);
        map.put(4, 1200);
        map.put(5, 5100);
        
        System.out.println(map);
        
        //retriving a value by key
        
        int valuekey1=map.get(1);
        System.out.println(valuekey1);
        //updating a value
        
        map.put(5, 3900);
        System.out.println(map);
        
        map.remove(3);
        System.out.println(map);

        //checking if a key exists
        boolean haskey1=map.containsKey(1);
        System.out.println(haskey1);
        
        //checking if a value exists
        
        boolean hasvalue=map.containsValue(12000);
        System.out.println(hasvalue);
        
        System.out.println("iterating over keys and values");
        for(Map.Entry<Integer, Integer> entey:map.entrySet()) {
                System.out.println("Key :"+entey.getKey() +",value: "+entey.getValue());
        }
        
        int size=map.size();
        System.out.println(size);
        
        map.clear();
        System.out.println("map after cleaning : "+map);
                        
}
}