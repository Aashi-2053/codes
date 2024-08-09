package com.dsa;

import java.util.Arrays;

public class Max_array {
    static int MaxArr(int a[],int n){
        int m=0;
        for(int i=0;i<n;i++){
            if(a[i]>m)m=a[i];
        }
        return m;
    }
    public static void main(String[] args) {
        int [] arr={1,3,4,7,2};
        System.out.println(Arrays.toString(arr));
        System.out.println("Max : "+MaxArr(arr,5));

    }
}
