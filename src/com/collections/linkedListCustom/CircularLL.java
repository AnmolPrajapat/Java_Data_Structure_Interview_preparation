package com.collections.linkedListCustom;

public class CircularLL {
    private Node head, tail;
    private int size;


    public CircularLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void delete(int value){
        if(head.val == value){
            head = head.next;
            tail.next = head;
            size-=1;
            return;
        }
        Node temp = head;
        while(temp.next.val != value){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size-=1;

    }
    public void inserting(int value){
        size+=1;
        Node node = new Node(value);
        if(head==null){
            head= node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void insertIdx(int index, int value){
        Node node = new Node(value);
        if(head==null || size==0){
            inserting(value);
            return;
        }
        if(index==0){
            node.next = head;
            tail.next = node;
            head = node;
            size+=1;
        }
        if(index == size){
            inserting(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node prev = temp.next;
        temp.next = node;
        node.next = prev;
        size = size+1;
//        node.next = temp.next;
//        temp.next = node;


    }
    public void display(){
        Node node = head;
        do{
            System.out.print(node.val+" ->");
            node = node.next;
        }while(node!= head);
        System.out.println();
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

//    @Override
//    public void insert(int index, int val) {
//        super.insert(index, val);
//    }

    public static void main(String[] args) {
        CircularLL ll = new CircularLL();
        ll.inserting(44);
        ll.inserting(77);
        ll.inserting(45);
        ll.insertIdx(0,56);
        ll.insertIdx(4,90);
//        ll.insertIdx(6, 800);
//        ll.insertIdx(2,7);
//        ll.insert(1,90);
//        ll.delete(77);
        ll.display();

//        ll.delete(56);
        ll.delete(56);
        ll.delete(77);

        ll.display();
        ll.delete(44);
        ll.display();



    }
}
