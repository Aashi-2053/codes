package com.dsa.recur;

import java.util.Arrays;

public class Bubble_recur {
    public static void main(String[] args) {
        int a[]={4,3,2,1};
        bubble_recur(a,a.length-1,0);
        System.out.println(Arrays.toString(a));
    }
    static void bubble_recur(int[] a,int i,int j){

        if(i==0)return;
        if(j<i){
            if(a[j]>a[j+1]) {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            bubble_recur(a,i,j+1);
        }
        else{
           bubble_recur(a,i-1,0);
        }
    }
}
