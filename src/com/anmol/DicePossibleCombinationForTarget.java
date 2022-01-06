package com.anmol;

import java.util.ArrayList;
import java.util.Arrays;

public class DicePossibleCombinationForTarget {
    public static void main(String[] args) {
        ArrayList<Integer> ans = diceCombi(0,4);
        ArrayList<Integer> ans1 = diceCombiArg(0,4,new ArrayList<>());
        ArrayList<Integer> face = diceFace(0,9, 8);



        System.out.print(ans +" \n" + ans1 + "\n"+ face);
    }


    static ArrayList<Integer> diceCombi(int process, int target){
        if(target == 0){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<=target; i++){
            ArrayList<Integer> newlist = diceCombi(process*10 +i, target-i);
            ans.addAll(newlist);
        }
        return ans;
    }


    static ArrayList<Integer> diceCombiArg(int process, int target, ArrayList<Integer> answer){
        if(target == 0){
            answer.add(process);
            return answer;
        }
//        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<=target; i++){
            answer = diceCombiArg(process*10 +i, target-i, answer);

        }
        return answer;
    }

    static ArrayList<Integer> diceFace(int process, int target, int face){
        if(target == 0){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<=target && i<= face; i++){
            ArrayList<Integer> newlist = diceFace(process*10 +i, target-i, face);
            ans.addAll(newlist);
        }
        return ans;
    }
}
