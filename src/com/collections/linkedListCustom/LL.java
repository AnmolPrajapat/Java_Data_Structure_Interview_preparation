package com.collections.linkedListCustom;

import java.util.Arrays;

public class LL {
    private Node head, tail;
    private int size=0 ;


    public LL(){
        this.size = size;
        System.out.println(size);
    }

//    public LL() {
//        this.head = head;
//        this.tail = tail;
//    }
//    public LL(Node head, Node tail) {
//        this.head = head;
//        this.tail = tail;
//    }

    public void insertFirst(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        }
        Node n = new Node(val);
        tail.next =n;
        n.next =null;
        size+=1;
    }
    public void insert(int index, int val){
        if(index==0){
            insertFirst(val);
            return;
        }

        if(index== size){
            insertLast(val);
            return;
        }
        Node newnodw = new Node(val);
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        Node prev = temp.next;
        temp.next = newnodw;
        newnodw.next= prev;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.val != value)
            node = node.next;
            else
                return node;
        }
        return null;
    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val +" ->");
            temp = temp.next;
        }
        System.out.print("End");
    }
//    public void deletion(int index){
//        if(index ==0){
//            head = head.next;
//            size-=1;
//
//            return;
//        }
//        Node temp = head;
//
//        if(index == size-1){
//            for(int i=0; i<size-2; i++){
//                temp = temp.next;
//            }
//            tail = temp;
//            tail.next = null;
//            size-=1;
//            return;
//        }
//        for (int i = 0; i < index-1; i++) {
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        size-=1;
//    }

    public void deleteFirst(){
        head = head.next;
        size-=1;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void deleteLast(){
//        Node temp = head;
//        for (int i = 0; i <size-1 ; i++) {
//            temp = temp.next;
//        }
//        tail = temp;
//        tail.next = null;
//        size-=1;
        if(size<=1){
            deleteFirst();
            return;
        }
        Node secondLast = get(size-1);
        tail = secondLast;
        tail.next =null;

    }


    public int delete(int index){
        if(index == 0){
            int temp =head.val;
             deleteFirst();
             return temp;
        }
        if(index == size-1){
            int temp =tail.val;
            deleteLast();
            return temp;
        }
        Node prev = get(index-1);
        int value = prev.next.val;

        prev.next = prev.next.next;
        return value;
//        System.out.println(prev.next);
    }
    public class Node{

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

//        public int getIdx(int val) {
//            int count =0;
//            Node node = head;
//            while(node!= null){
//                if(node.val == val){
//                    return count;
//                }
//                else
//                    count++;
//            }
//            return -1;
//        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(55);
        list.insertFirst(58);
        list.insertFirst(33);
        list.insertFirst(29);

        list.insertLast(80);
        list.insertLast(70);

        list.insert(5,75);

        list.display();

        list.deleteFirst();


        list.display();
        list.deleteLast();
        System.out.println();
        list.display();
//        System.out.println(Arrays.toString(list.get(3)));
        System.out.println(list.delete(2));

        list.display();
        System.out.println();
        System.out.println(list.delete(0));

        list.display();
        System.out.println();
//        System.out.println(list.delete(2));
        System.out.println(list.delete(2));
        list.display();
        list.insert(0,99);
        list.display();

        System.out.println(list.find(70));

    }
}
