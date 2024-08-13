package com.dsa;

public class Insertion_sort {

    
    static void insertion(int [] a) {//O(n^2)
        for (int i = 0; i < a.length-1; i++) {
        for(int j-i+1;j>0;j--)
          {
          if(a[j]<a[j-1])
          {
            int temp=a[j];
          a[j]=a[j-1];
          a[j-1]=temp;
          }
          else break;
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
        insertion(a);
        System.out.println();
        System.out.print("After: ");
        System.out.println();
        print(a);
    }
}
