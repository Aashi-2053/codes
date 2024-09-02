package com.dsa.recur;

import java.util.Arrays;

public class Selection_recur {
    public static void main(String[] args) {
        int a[]={4,3,2,8,1};
        selection_recur(a,a.length,0,0);
        System.out.println(Arrays.toString(a));
    }
    static void selection_recur(int[] a,int i,int j,int max){

        if(i==0)return;
        if(j<i){
            if(a[j]>a[max]){
                selection_recur(a,i,j+1,j);
            }
            else{
                selection_recur(a,i,j+1,max);
            }
        }
        else{
            int temp=a[max];
            a[max]=a[i-1];
            a[i-1]=temp;
            selection_recur(a,i-1,0,0);
        }
    }
}
