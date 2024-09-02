
package com.dsa.recur;

public class Recur_sorted {//O(n)
    public static boolean sorted_or_not(int [] a,int i)
    {
        if(i==a.length-1){
            return true;
        }
        return a[i]<a[i+1] && sorted_or_not(a,i+1);

    }
    public static void main(String[] args) {
        int [] a={1,2,3,4};
        System.out.println(sorted_or_not(a,0));

    }
}
