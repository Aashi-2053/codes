package com.dsa;

import java.util.Arrays;

public class Reverse_Arr {
    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void rev(int a[],int n){
        int s=0;
        int e=a.length-1;

        while(s<e){
            swap(a,s,e);
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,3,4,7,2};
        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr));
        rev(arr,5);
        System.out.print("Array after reverse : ");
        System.out.println(Arrays.toString(arr));

    }
}
