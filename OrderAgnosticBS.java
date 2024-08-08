package com.dsa;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] a={1,5,22,33,63,74,85};
        int target=6;
        System.out.println(orderAgnosticsBS(a,target));
    }
    static  int orderAgnosticsBS(int[] a,int target)
    {
        int s=0,e=a.length-1;
        boolean isAsc=a[s]<a[e];
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==target) return mid;
            if(isAsc) {
                if (a[mid] > target) e = mid - 1;
                else s = mid + 1;
            }
            else{
                if (a[mid] < target) e = mid - 1;
                else s = mid + 1;
            }
        }
        return -1;
    }
}
