package com.anmol;

import java.util.ArrayList;
import java.util.Scanner;

public class RiverInMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {2,3,4,5,0},
                {1,7,8,0,1},
                {1,1,1,1,1}
        };
        Scanner sc = new Scanner(System.in);
//        int startRow = sc.nextInt();
//        int startCol = sc.nextInt();
//        int endRow = sc.nextInt();
//        int endCol = sc.nextInt();

        System.out.print(riverMaze("",maze,0,1,2,4));
    }
    static ArrayList<String> riverMaze(String p,int[][] maze, int rs, int cs, int re, int ce){
        if(rs == re && cs == ce){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(rs<re){
            ans.addAll(riverMaze(p+'D',maze,rs+1,cs,re,ce));
        }
        if(cs<ce){
            ans.addAll(riverMaze(p+'R',maze,rs,cs+1,re,ce));
        }

        return ans;
    }
}
