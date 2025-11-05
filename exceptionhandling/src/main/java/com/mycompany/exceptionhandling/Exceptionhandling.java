/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptionhandling;

/**
 *
 * @author AMITAVA
 */
public class Exceptionhandling {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int[] numerators = {100,253,365,852};
        int[] denominators = {2,5,0,6};
        
        try {
            for(int i=0;i<numerators.length;i++){
                System.out.println(numerators[i]/denominators[i]);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divided by 0");
        }
    }
}
