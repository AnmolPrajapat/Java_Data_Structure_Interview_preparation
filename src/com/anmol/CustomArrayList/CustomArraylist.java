package com.anmol.CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {
    static int defaultSize = 1;
    private static int[] data = new int[defaultSize];
    int size = 0;
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size== data.length;
    }
    public void resize(){
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public void remove(int index){
//        size = size-1;
        for (int i = index; i < data.length-1 ; i++) {
            data[i] = data[i+1];
        }
//        data[data.length-1] = 0;
        size--;
    }



    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(45);
        CustomArraylist obj = new CustomArraylist();
        obj.add(45);
        obj.add(67);
        obj.add(87);
        obj.add(97);
        obj.remove(2);
        obj.remove(1);
        obj.add(89);
        System.out.println(Arrays.toString(data));
    }
}
