package com.tnsif.constructorprogram;

class User1{
        String name;
        int age;
        
        //Default const
        User1(){
                name="Guest";
                age=5;
                System.out.println("Guest profile created");
        }
        //parameter const
        
        User1(String name,int age){
                this.name=name;
                this.age=age;
                System.out.println("User creaed :"+"name "+ name +" "+ "Age :"+age);
        }
}

