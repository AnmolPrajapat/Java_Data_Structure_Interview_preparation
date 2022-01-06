package com.anmol.ObjectN_Inheritence;

public class Main {
    double l = -9.12;

    public static void main(String[] args) {
//        Box box = new Box(5);
//        System.out.print(box.l+" "+ box.b+" "+ box.h);
//        BoxWeight box = new BoxWeight(5,6);
//         System.out.print(box.l+", "+ box.b+", "+ box.h+", "+ box.weight);
         BoxPrice box = new BoxPrice(5,6,300);
         System.out.print(box.l+", "+ box.b+", "+ box.h+", "+ box.weight+ ", "+ box.cost);



    }
}
