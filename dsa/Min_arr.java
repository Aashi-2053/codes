package com.dsa;

public class Min_arr {
    public static void main(String[] args) {
        int[] nums = {6, 99, 5, 70, 2, 88, 33, 9};
        int target = 70;
        System.out.println(min(nums));
    }
    static int min(int[] a) {
        int  ans=a[0];
        if (a.length == 0) return -1;
        for (int i = 1; i <a.length; i++) {
            if (a[i] < ans) ans=a[i];
        }
        return ans;
    }
}
