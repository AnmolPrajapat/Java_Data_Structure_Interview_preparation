package com.collections.linkedListCustom;

public class DoublyLL {
    private Node head;
    private int size;

    public DoublyLL() {
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val+" ->");
            temp = temp.next;
        }
        System.out.print("END \n");
    }
    public void insertFirst(int value){
        Node newnode = new Node(value);
        newnode.next = head;
        newnode.prev = null;
        if(head!= null){
            head.prev = newnode;
        }
        head = newnode;

        size+=1;
    }
    public void insertLast(int value){
        Node newnode = new Node(value);
        Node temp = getLastNode();
        temp.next=newnode;
        newnode.next = null;
        newnode.prev = temp;

    }
    public Node findNode(int value){
        Node temp = head;
        if(head == null){
            return null;
        }
        while(temp.val != value){
            temp = temp.next;
        }
        if(temp == null){
            insertLast(value);
        }
        return temp;
    }
    public void insertAfterNode(int valueInLL, int insertValue){
        Node newnode = new Node(insertValue);
        Node temp = findNode(valueInLL);
        Node pevNext= temp.next;
        temp.next = newnode;
        newnode.prev = temp;
        newnode.next = pevNext;
        pevNext.prev = newnode;
    }
    public void insert(int index, int val){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node newnode = new Node(val);
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        Node nextPrev = temp.next;
        temp.next = newnode;
        newnode.prev = temp;
        newnode.next = nextPrev;

        nextPrev.prev= newnode;
    }

    public Node getLastNode() {
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        return temp;
    }
    public void displayRev(){
        Node temp = getLastNode();
        while(temp!= null){
            System.out.print(temp.val + " ->");
            temp = temp.prev;
        }
        System.out.print("End \n");
    }
    public void updateRevLL(){
        displayRev();
        return;
    }

    public class Node{
         int val;
         Node next;
         Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        DoublyLL dl = new DoublyLL();
        dl.insertFirst(34);
        dl.insertFirst(28);
        dl.insertFirst(12);
        dl.insertFirst(5);
        dl.display();

        dl.insertLast(45);
        dl.display();
        dl.insert(2,20);
        dl.display();
        dl.insert(0,56);
//        dl.insert(7,96);

        dl.display();
        dl.displayRev();
        dl.insert(4,89);
        dl.display();
//        dl.updateRevLL();
        dl.insertAfterNode(89,95);
        dl.insertAfterNode(12,17787);

        dl.display();

    }
}
