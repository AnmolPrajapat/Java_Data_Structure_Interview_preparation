package com.anmol;

import java.util.ArrayList;

public class Dice_problem {
    public static void main(String[] args) {
//        System.out.println(dice(0,5));
//        System.out.println(diceAns(0,3, new ArrayList<Integer>()));
        System.out.println(permutationSting("", "abc"));

    }
    static ArrayList<Integer> dice(int p, int target){
        if(target==0){
            ArrayList<Integer> listt = new ArrayList<>();
            listt.add(p);
            return listt;
        }
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=1; i<=target; i++){
            ArrayList<Integer> ans = dice(p*10 + i , target-i);
            answer.addAll(ans);
        }
        return answer;
    }
    static ArrayList<Integer> diceAns(int p, int target, ArrayList<Integer> ans){
        if(target == 0){
            ans.add(p);
            return ans;
        }
        for(int i=1; i<=target; i++){
            diceAns(p*10 +i, target-i, ans);
        }
        return ans;
    }
    static ArrayList<String> permutationSting(String p, String un){
        if(un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<= p.length(); i++){
            char ch = un.charAt(0);
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

            ArrayList<String> answer = permutationSting(first+ch+second, un.substring(1));
            list.addAll(answer);
        }
        return list;

    }
}
