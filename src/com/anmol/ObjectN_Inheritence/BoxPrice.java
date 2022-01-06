package com.anmol.ObjectN_Inheritence;

public class BoxPrice extends BoxWeight {
    double cost ;

//    public BoxPrice(double weight, double cost) {
//        super(weight);
//        this.cost = cost;
//    }

    public BoxPrice(double cost) {
        this.cost = cost;
    }

    public BoxPrice(double l, double b, double h, double weight, double cost) {
        super(l, b, h, weight);
        this.cost = cost;
    }

    public BoxPrice(double size, double weight, double cost) {
//        super(size, weight);
        this.cost = cost;
    }
}
