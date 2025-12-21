/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threadsmain;

/**
 *
 * @author AMITAVA
 */

class ThreadOne extends Thread{
    public void run(){
        try{
            for(int i=1;i<100;i++){
                System.out.println("thread 1 : "+i);
                sleep(5);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }

    }
}

class ThreadTwo extends Thread{
    public void run(){
        for(int i=100;i<200;i++){
            System.out.println("Thread 2 : "+i);
        }
    }
}

public class ThreadsMain {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        
        t1.start();
        t2.start();
    }
}
