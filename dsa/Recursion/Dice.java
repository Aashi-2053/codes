package com.dsa.recur;

public class Dice {
    public static void main(String[] args) {
        dice("",4);
    }
    static void dice(String p, int k){
        if(k==0)
        {
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6&&i<=k;i++){
            dice(p+i,k-i);
        }
    }
}
