package com.tnsif.exceptionhandling;
//demo for throw keyword (ATM)
public class Throwdemo {
     
     static void withdraw(int balance,int amount) {
             if(amount>balance) {
                     throw new RuntimeException("Insufficient balance");
             }
             System.out.println("money withdraw successfully");
     }
     
     
     public static void main(String[] args) {
             Throwdemo.withdraw(5000, 10000);
     }

}