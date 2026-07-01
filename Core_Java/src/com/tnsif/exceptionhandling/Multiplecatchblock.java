package com.tnsif.exceptionhandling;
//multiple catch block
public class Multiplecatchblock {
public static void main(String[] args) {
     int number[]=new int[4];// 4 elements 0-3
     try {
             number[9]=50/0;
     }
     catch(ArithmeticException t) {
             System.out.println("good evening"+t.getMessage());
     }
     catch(ArrayIndexOutOfBoundsException h) {
             System.out.println("goodmorning"+h.getMessage());
     }
     catch(Exception j) {
             System.out.println("hello world"+ j.getMessage());
     }
}
}

