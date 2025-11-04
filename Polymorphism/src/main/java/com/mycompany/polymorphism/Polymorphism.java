/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism;

/**
 *
 * @author AMITAVA
 */

//Function overloading
class Student{
    String name;
    int age;
    
    public void printInfo(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    }
    
    public void printInfo(String name){
        System.out.println("Name is : "+name);
    }
    
    public void printInfo(int age){
        System.out.println("Age is : "+age);
    }
    
    public void printInfo(String name,int age){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    }
        
}
public class Polymorphism {

    public static void main(String[] args) {
        Student stu=new Student();
        stu.age=21;
        stu.name="Amitava";
        
        stu.printInfo();
        stu.printInfo("Srinjinee");
        stu.printInfo(21);
        stu.printInfo("Srinjinee", 20);
        
    }
}
