/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2;

/**
 *
 * @author AMITAVA
 */

class Student {
    String name;
    int age;
    
    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


//Non-parameterized constructor
    public Student() {
        System.out.println("This is a non-parameterized constructor.");
    }

//    Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    Copy Constructor
    public Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
}


public class Project2 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Student s1=new Student();
        s1.name="Amitava";
        s1.age=20;
        
        s1.printName();
        
        Student s2 = new Student("Srinjinee", 20);
        s2.printName();
        
        Student s3=new Student(s1);
        s3.printName();
    }
}
