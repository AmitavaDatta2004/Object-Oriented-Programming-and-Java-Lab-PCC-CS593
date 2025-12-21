/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threadshared;

/**
 *
 * @author AMITAVA
 */

class ThreadOne extends Thread{
    static int count = 0;
    
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.err.println("Thread 1 : Count = "+count);
                count++;
                Thread.sleep(5);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

class Threadtwo extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("Thread 2 : Count = "+ThreadOne.count);
                ThreadOne.count++;
                Thread.sleep(5);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

public class ThreadShared {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        ThreadOne t1=new ThreadOne();
        Threadtwo t2 = new Threadtwo();
        
        t1.start();
        t2.start();
    }
}
