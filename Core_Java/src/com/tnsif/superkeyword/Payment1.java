package com.tnsif.superkeyword;
// demo for super method
class Payment1{
        void process() {
                System.out.println("processing payment using standard gateway..");
        }
}
class Gpay extends Payment1{
        void process() {
                System.out.println("processing payment using standard gpay..");
        }
        
        void completetransation() {
                super.process();//parent class
                process();// child class
        }
}


