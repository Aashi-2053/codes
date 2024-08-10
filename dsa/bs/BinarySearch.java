package com.dsa;

public class Binary_Search {
    static int binary(int [] a,int target)
    {
        int s=0,e=a.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==target) return mid;
            else if(a[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,5,22,33,63,74,85};
        int target=6;
        System.out.println(binary(a,target));
    }
}
