/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlist;

/**
 *
 * @author AMITAVA
 */
class Node{
    int data;
    Node next;
     
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class List{
    Node head;
    
    public List(){
        this.head=null;
    }
    
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        } else {
            Node ptr = head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=newNode;
        }
    }
    
    void delete(int data){
        if(head==null){
            System.out.println("List is empty!!");
            return;
        }
        
        if(head.data==data){
            head=head.next;
            return;
        }
        
        Node ptr=head;
        while(ptr.next!=null && ptr.next.data != data){
            ptr=ptr.next;
        }
        
        if(ptr.next!=null){
            ptr.next=ptr.next.next;
        } else {
            System.out.println("Value not found");
        }
    }
    
    void printList(){
        Node ptr = head;
        
        System.out.println("Linked list is:");
        
        while(ptr.next!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.print("null");
        System.out.println();
    }
}

public class LinkedList {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        
        List list=new List();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.printList(); 
        list.delete(20);
        list.printList(); 
        list.delete(40); 

        List list2 = new List();
        list2.insert(5);
        list2.insert(15);
        list2.insert(45);
        list2.printList(); 
//        list.mergeList(list2);
        list.printList();
    }
}
