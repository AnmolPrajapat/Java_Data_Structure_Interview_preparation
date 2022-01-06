package com.anmol.ObjectN_Inheritence;

public class Box {
    double l;
    double h;
    double b;
     double side;

    public Box(){
        this.l = -1;
        this.b= -1;
        this.h = -1;
    }
    public Box(double l, double h, double b) {
        this.l = l;
        this.h = h;
        this.b = b;
    }
    public Box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }
}
