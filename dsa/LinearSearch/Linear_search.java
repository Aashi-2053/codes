package com.dsa.LinearSearch;

public class Linear_search {
    static int linear_s(int[] a, int target) {
        if (a.length == 0) return -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) return i;
        }
        return -1;
    }
//
    public static void main(String[] args) {
        int[] nums = {6, 99, 5, 70, 2, 88, 33, 9};
        int target = 70;
        System.out.println(linear_s(nums, target));
    }
}
