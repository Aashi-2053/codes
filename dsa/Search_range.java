package com.dsa;

public class Search_range {
    public static void main(String[] args) {
        int[] nums = {6, 99, 5, 70, 2, 88, 33, 9};
        int target = 70;
        System.out.println(range_search(nums, target,1,4));
    }
    static int range_search(int[] a, int target,int s,int e) {
        if (a.length == 0) return -1;
        for (int i = s; i <=e; i++) {
            if (a[i] == target) return i;
        }
        return -1;
    }

}
