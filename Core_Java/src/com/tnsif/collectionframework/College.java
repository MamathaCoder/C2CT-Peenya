package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// demo for comparator (Multiple sorting)

class College{
        String name;
        int rollno;
        String address;
        
        public College(String name, int rollno, String address) {
                
                this.name = name;
                this.rollno = rollno;
                this.address = address;
        }
        
        void display() {
                System.out.println("Name "+name+" "+"rollno "+rollno+" "+"address");
        }
}
// sort by name

class Namecomparator implements Comparator<College>{

        @Override
        public int compare(College o1, College o2) {
                
                return o1.name.compareTo(o2.name);
        }
        
}
//sort by rollno

class RollnoComparator implements Comparator<College>{

        @Override
        public int compare(College o1, College o2) {
                
                return Integer.compare(o1.rollno, o2.rollno);
        }
        
}
//sort by address

class Addresscomparator implements Comparator<College>{

        @Override
        public int compare(College o1, College o2) {
                
                return o1.address.compareTo(o2.address);
        }
        
}