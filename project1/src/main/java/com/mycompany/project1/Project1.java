/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;

/**
 *
 * @author AMITAVA
 */


class Pen {
    String color;
    String type; //ballpoint,gel;
    
    public void write(){
        System.out.println("Write something");
    }
    
    public void printColor(){
        System.out.println(color);
    }
//    public void read(){
//        System.out.println("");
//    }
}



public class Project1 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";
        
        pen1.write();
        
        
        Pen pen2=new Pen();
        pen2.color="red";
        pen2.type="ballpoint";
        
        pen1.printColor();
        pen2.printColor();
    }
}
