package com.tnsif.collectionframework;

import java.util.LinkedList;
import java.util.Queue;

// demo for queue
public class Queue_Linkedlist {
        
        public static void main(String[] args) {
                Queue<Integer> q=new LinkedList<>();
                
                q.add(10);
                q.add(20);
                q.add(90);
                q.add(180);
                
                System.out.println(q);
                //peek at the front element without remobing it
                
                System.out.println(q.peek());
                
                //poll-remove and return the front element
                System.out.println(q.poll());
                
                //remove and print the rest of the elemnet
                System.out.println("removed the element "+q.poll());
                
                System.out.println(q.isEmpty());
                
        }

}
