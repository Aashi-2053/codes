package com.dsa;

import java.util.Arrays;

public class Swap__arr {
    public static void main(String[] args) {
        int [] arr={1,3,4,7,2};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
