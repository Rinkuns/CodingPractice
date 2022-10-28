package com.coding.prac;

import java.util.LinkedList;
import java.util.Queue;

class PlantingTrees{
    static int trees(int input1,int input2){
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(2);
        for(int i=0;i<input1;i++){
            int v=q.remove();
            for(int j=0;j<((v+1)%input2);j++){
                q.add(j);
            }
        }
        return q.size();
    }
    public static void main(String[] args){
        int input1=1;
        int input2=5;
        System.out.println(trees(input1,input2));
    }
}
