package com.anmol;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationString {
    public static void main(String[] args) {
//       ArrayList<String> listtt =  permutation("", "abc");
//       System.out.print(listtt);
//        System.out.print(permutataionforAll("","abc"));
//        permutation2("", "abc");
        System.out.print(permutationCount("","ab"));
    }
    static ArrayList<String> permutation(String p, String un) {
        ArrayList<String> list = new ArrayList<>();
        if(un.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = un.charAt(0);

        ArrayList<String> left = permutation(ch+p, un.substring(1));

        ArrayList<String> right = permutation(p+ch,un.substring(1));

        left.addAll(right);
        return left;
    }
    static void permutation2(String p, String un) {
        if(un.isEmpty()){
            System.out.print(p);
            return;
        }
        char ch = un.charAt(0);
                 permutation(ch+p, un.substring(1));
                 permutation(p+ch,un.substring(1));
    }
    static ArrayList<String> permutataionforAll(String p, String un){
        ArrayList<String> list = new ArrayList<>();
        if(un.isEmpty()){
            list.add(p);
            return list;
        }
        ArrayList<String> listtt = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0,i);
            char ch = un.charAt(0);
            String second = p.substring(i,p.length() );
            ArrayList<String> demo =  permutataionforAll(first+ch+second, un.substring(1));
            listtt.addAll(demo);
        }
        return listtt;
    }
    static int permutationCount(String p, String un){
        if(un.isEmpty()){
            return 1;
        }
        char ch = un.charAt(0);
        int count =0;
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count +permutationCount(f+ch+s, un.substring(1));
        }
        return count;
    }
}
