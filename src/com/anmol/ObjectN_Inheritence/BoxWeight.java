package com.anmol.ObjectN_Inheritence;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double weight) {

        this.weight = weight;
    }
    public BoxWeight(){
        super();
        this.weight = 9;
    }
    public BoxWeight(double l, double b, double h, double weight){
//        super(l,b,h);
        this.weight = weight;
    }
    public  BoxWeight(double size, double weight){
        super(size);
        this.weight = weight;
        System.out.println(size*size*size* weight);
    }
}
