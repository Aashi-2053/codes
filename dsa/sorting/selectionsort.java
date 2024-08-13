package com.dsa;

public class selection_sort {
    //sbse chota pehle //ya bada peeche
    //1 swaps per iteration
    static void selection(int [] a) {//O(n^2)
        for (int i = 0; i < a.length - 1; i++) {
            int min=i;
            for (int j = i+1; j < a.length ; j++) {
                if (a[min] > a[j])
                //swap
                {
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
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
           selection(a);
            System.out.println();
            System.out.print("After: ");
            System.out.println();
            print(a);
        }
}
