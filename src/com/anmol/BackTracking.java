package com.anmol;

import java.util.ArrayList;
import java.util.Collection;

public class BackTracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true, true},
                {true, true, false, true},
                {true, true, true, true}
        };
        allPath("",maze,0,0);
        System.out.print(allPathRet("",maze,0,0));
    }
    static void allPath(String p, boolean[][] maze , int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(p);
            return ;
        }
        if(maze[r][c] == false){
            return ;
        }
        maze[r][c] = false;
        if(r<maze.length-1){
            allPath(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPath(p+'R',maze,r,c+1);
        }
        if(r>0){
            allPath(p+'U',maze,r-1,c);
        }
        if(c>0){
            allPath(p+'L',maze,r,c-1);
        }
        maze[r][c]= true;
    }
    static ArrayList<String> allPathRet(String p, boolean[][] maze , int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
//        if(maze[r][c] == false){
//            return
//        }
        maze[r][c] = false;

        ArrayList<String> ans = new ArrayList<>();

        if(r<maze.length-1){
           ans.addAll(allPathRet(p+'D',maze,r+1,c));
        }
        if(c<maze[0].length-1){
            ans.addAll(allPathRet(p+'R',maze,r,c+1));
        }
        if(r>0){
            ans.addAll(allPathRet(p+'U',maze,r-1,c));
        }
        if(c>0){
            ans.addAll(allPathRet(p+'L',maze,r,c-1));
        }
        maze[r][c]= true;
        return ans;
    }
}
