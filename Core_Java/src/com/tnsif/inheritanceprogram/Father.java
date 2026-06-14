package com.tnsif.inheritanceprogram;
//demo for inheritance
class Father{
        int money=90000;
        String car="bmw";
        
        void drinking() {
                System.out.println("coffe");
        }
}
class Son extends Father{
        String cycle="pink";
        
        void read() {
                System.out.println("java");
        }
}

