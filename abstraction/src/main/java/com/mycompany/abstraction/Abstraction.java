/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstraction;

/**
 *
 * @author AMITAVA
 */

abstract class Animal{
    abstract void walk();
    public void eats(){
        System.out.println("Eats");
    }
    
    Animal(){
        System.out.println("You are creating an animal...");
    }
        
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    
    Horse(){
        System.out.println("Horse created...");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Horse h1=new Horse();
        h1.walk();
        h1.eats();
    }
}
