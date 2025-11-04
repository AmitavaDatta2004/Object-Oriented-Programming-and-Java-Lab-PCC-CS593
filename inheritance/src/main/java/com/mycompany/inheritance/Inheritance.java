/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;

/**
 *
 * @author AMITAVA
 */

//Parent class
class Shape{
    String color;
    
    public void area(){
        System.out.println("Display Area");
    }
}


//Sub Class
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println("Area is : "+1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println("Area is :"+3.14*r*r);
    }
}


public class Inheritance {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color="red";
    }
}
