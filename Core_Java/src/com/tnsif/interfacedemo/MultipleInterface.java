package com.tnsif.interfacedemo;

//demo for multiple interface

//first interface
interface Camera{
     void takephoto();
}
//second interface
interface Musicplayer{
     void playmusic();
}
//A class implementing multiple interafce

class Smartphone implements Camera,Musicplayer{

     @Override
     public void playmusic() {
             System.out.println("take a photo");
             
     }

     @Override
     public void takephoto() {
             System.out.println("listen music");
             
     }
     
}

public class MultipleInterface {
public static void main(String[] args) {
     Smartphone s=new Smartphone();
     s.takephoto();
     s.playmusic();
}
}
