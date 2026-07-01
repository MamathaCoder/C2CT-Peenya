package com.tnsif.collectionframework;
//demo for stack

import java.util.Iterator;
import java.util.Stack;

public class Stackdemo {
     public static void main(String[] args) {
     
Stack<Integer> al=new Stack<>();

//adding the data
al.push(3);
al.push(0);
al.push(3);
al.push(2);
al.push(3);
al.push(7);
al.push(4);
al.push(5);
System.out.println(al);

System.out.println("top element "+al.peek());

System.out.println(al.pop());
System.out.println(al.pop());

System.out.println(al);
System.out.println(al.isEmpty());

Iterator<Integer> i=al.iterator();
while(i.hasNext()) {
     System.out.println(i.next());
}


}
}
