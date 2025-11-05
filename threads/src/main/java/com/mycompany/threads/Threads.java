/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threads;

import static java.lang.Thread.sleep;

/**
 *
 * @author AMITAVA
 */

class Countdown extends Thread{
    public void run(){
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception occured");
            }
        }
    }
}

class ThreadOne extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Exception occured");
            }
        }
    }
}

class ThreadTwo extends Thread{
    public void run(){
        for(int i=11;i<=20;i++){
            System.out.println(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Exception occured");
            }
        }
    }
}


public class Threads {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        
//        Countdown c1 = new Countdown();
//        c1.start();

        ThreadOne t1=new ThreadOne();
        ThreadTwo t2=new ThreadTwo();
        
        t1.start();
        t2.start();
    }
}
