package com.dsa.recur;

public class LinearSearch_recur {
    static int findIndex(int[] a,int k,int i){
        if(i==a.length){
            return -1;
        }
       if(a[i]==k) return i;
       return findIndex(a,k,i+1);

    }
    static boolean find(int[] a,int k,int i){
        if(i==a.length){
            return false;
        }
      return (a[i]==k) || find(a,k,i+1);

    }
    public static void main(String[] args) {
        int [] a={3,2,1,18,9};
        System.out.println(findIndex(a,18,0));
        System.out.println(find(a,18,0));
    }
}
