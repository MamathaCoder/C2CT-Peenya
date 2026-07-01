package com.tnsif.exceptionhandling;

public class Test3 {
public static void main(String[] args) {
        try {
                System.out.println(7/0);
        }
        catch(ArrayIndexOutOfBoundsException n) {
                System.out.println(n.getMessage());
        }
        finally {
                System.out.println("am a king");
        }
}
}
