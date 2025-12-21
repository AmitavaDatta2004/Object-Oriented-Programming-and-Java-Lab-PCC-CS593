/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exam;

/**
 *
 * @author AMITAVA
 */

public interface Prototype {
    Prototype clone();
}



public class Exam {

    public static void main(String args[]) {

        Student obj = new Student(age: 20, rollNumber: 75, name: "Ram");
        Student cloneObj = (Student) obj.clone();
    }
}
