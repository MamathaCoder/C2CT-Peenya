package com.tnsif.superkeyword;

//demo for super constructor 

class User1{
     User1(){
             System.out.println("user account created..");
     }
}
class AdminUser extends User1{
     AdminUser(){
             super(); // calls user constructor 
             System.out.println("admin granted ");
     }
}
