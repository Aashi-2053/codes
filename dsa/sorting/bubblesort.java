package com.dsa;

public class Bubble_sort {//O(n^2)
    //sbse bada pehle peeche
    //many swaps in iteration
    static void bubble(int [] a) {
        int temp=0;
       for (int i=0;i<a.length-1;i++) {
           for (int j = 0; j < a.length-i-1; j++) {
               if(a[j]>a[j+1])
                   //swap
               {
                   temp = a[j];
                   a[j] = a[j + 1];
                   a[j + 1] = temp;
               }
           }
       }
    }
    static void print(int [] a)
    {
        for (int j : a) System.out.println(j + " ");
    }
    public static void main(String[] args) {
        int[] a={7,8,3,1,2};
        System.out.print("Before: ");
        System.out.println();
        print(a);
        bubble(a);
        System.out.println();
        System.out.print("After: ");
        System.out.println();
        print(a);
    }
}
