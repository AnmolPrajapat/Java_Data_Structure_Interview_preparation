package com.anmol;

import java.util.ArrayList;

public class PathInMaze {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        int ans = countInMaze(mat, 0,0, 2,3);
        System.out.print(ans);
        System.out.print("\n"+ allPossiblePaths("", mat,0,0,1,2));
    }
    static int countInMaze(int[][] mat, int rs, int cs, int re, int ce){
        if(rs == mat.length-1 || cs == mat[0].length-1) return 1;
        int count =0;
        int down = countInMaze(mat,rs+1,cs,re,ce);
        int right = countInMaze(mat,rs,cs+1,re,ce);
        count = down + right;
        return count;
    }
    static ArrayList<String> allPossiblePaths(String p, int[][] mat, int rs, int cs, int re, int ce){
//        if(rs >re) {
//            ArrayList<String> list =new ArrayList<>();
//            for(int i=cs; i<ce; i++){
////                ArrayList<String> answ = new ArrayList<>();
//                list = allPossiblePaths(p+'R',mat,rs-1,cs+1,re,ce);
//
//            }
//            return list;
//
//        }
//        if( cs>ce ) {
//            ArrayList<String> list =new ArrayList<>();
//            for(int i=rs; i<re; i++){
////                ArrayList<String> answ = new ArrayList<>();
//                list = allPossiblePaths(p+'D',mat,rs+1,cs-1,re,ce);
//
//            }
//            return list;
//
//        }
//        ArrayList<String> answ = new ArrayList<>();
        if(rs == re && cs == ce){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(rs< re){
            ArrayList<String> down = allPossiblePaths(p+'D',mat,rs+1,cs,re,ce);
            ans.addAll(down);
        }
        if(cs< ce){
            ArrayList<String> right = allPossiblePaths(p+'R',mat,rs,cs+1,re,ce);
            ans.addAll(right);
        }
        return ans;

    }
}
