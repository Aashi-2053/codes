package com.dsa.recur;

public class Rotated_BS_recur {
    public static void main(String[] args) {
        int a[] = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(a, 8, 0, a.length - 1));

    }

    static int search(int[] a, int k, int s, int e) {
        if (s > e) return -1;
        int mid = s + (e - s) / 2;
        if (a[mid] == k) return mid;

        if (a[s] <= a[mid]) {
            if (k >= a[s] && k <= a[mid])
                return search(a, k, s, mid - 1);
            else return search(a, k, mid + 1, e);
        }
        if (k >= a[mid] && k <= a[e]) {
            return search(a, k, mid + 1, e);
        }
            return search(a, k, mid + 1, e);



}
}
