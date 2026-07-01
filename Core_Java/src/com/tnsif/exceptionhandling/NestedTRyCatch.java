package com.tnsif.exceptionhandling;
public class NestedTRyCatch {
public static void check() {
        
        String str1="TNS";
        int slength=str1.length();//3
        System.out.println("string length "+slength);
        
        String str2=null; //0
        
        int y=6;
        try {
                try {
                        System.out.println(str1.charAt(y));
                }
                catch(StringIndexOutOfBoundsException g) {
                        System.out.println(g.getMessage());
                }
                System.out.println("string length "+str2.length());
        }
                catch(NullPointerException u) {
                        System.out.println(u.getMessage());
        }
}
public static void main(String[] args) {
        NestedTRyCatch.check();
}
}
