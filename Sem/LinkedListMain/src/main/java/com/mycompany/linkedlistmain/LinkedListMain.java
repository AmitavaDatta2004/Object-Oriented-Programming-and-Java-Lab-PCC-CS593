/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlistmain;

/**
 *
 * @author AMITAVA
 */

class LinkedListDemo{
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static Node head= null;
    
    //Insert at end
    static void insert(int data){
        Node newNode = new Node(data);
        
        if(head==null){
            head=newNode;
        }
        
        Node temp = head;
        
    }
}

public class LinkedListMain {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
