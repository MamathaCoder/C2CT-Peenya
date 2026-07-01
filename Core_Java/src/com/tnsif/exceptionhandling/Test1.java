package com.tnsif.exceptionhandling;
//demo for finally block(with exception)
public class Test1 {
     public static void main(String[] args) {
             try {
                     System.out.println("good job");
             System.out.println(5/0);
             System.out.println("welcome");
             System.out.println("welcome to python");
     }
             catch(Exception e) {
                     System.out.println(e.getMessage());
             }
             finally {
                     System.out.println("welcome to java");
             }
             }

}
