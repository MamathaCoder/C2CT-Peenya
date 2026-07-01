package com.tnsif.stringprograms;

//demo for string buffer 
public class StringBufferdemo {
     public static void main(String[] args) {
             
             StringBuffer b=new StringBuffer("welcome");
             System.out.println(b);
             b.append(" to my home");
             
             System.out.println(b);
             
             System.out.println(b.delete(2, 5));
             System.out.println(b);
             
             System.out.println(b.reverse());
             
             System.out.println(b.replace(1, 3, "python"));
             
             System.out.println(b.charAt(6));
     }

}
