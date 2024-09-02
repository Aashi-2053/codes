package com.dsa.recur;

import java.util.ArrayList;

public class LinearSearch_recur {
    static int findIndex(int[] a,int k,int i){
        if(i==a.length){
            return -1;
        }
       if(a[i]==k) return i;
       return findIndex(a,k,i+1);

    }
    static int findLastIndex(int[] a,int k,int i){
        if(i==-1){
            return -1;
        }
        if(a[i]==k) return i;
        return findIndex(a,k,i--);

    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[] a,int k,int i){
        if(i==a.length){
            return ;
        }
        if(a[i]==k)list.add(i);
        findAllIndex(a,k,i+1);

    }
    static boolean find(int[] a,int k,int i){
        if(i==a.length){
            return false;
        }
      return (a[i]==k) || find(a,k,i+1);

    }
    public static void main(String[] args) {
        int [] a={3,2,1,18,1,9};
        System.out.println(findIndex(a,18,0));
        System.out.println(find(a,18,0));
        System.out.println(findLastIndex(a,1,a.length-1));
        findAllIndex(a,1,0);
        System.out.println(list);
    }
}
