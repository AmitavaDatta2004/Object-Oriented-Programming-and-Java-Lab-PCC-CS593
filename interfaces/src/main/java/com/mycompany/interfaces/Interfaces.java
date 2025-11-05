/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

/**
 *
 * @author AMITAVA
 */

interface Animal{
    int eyes =2;
    void walk();
}

interface Herbivore{
    
}

class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class Interfaces {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
