package com.dsa.bs;
import java.util.Arrays;

public class Search_2D {
    public static void main(String[] args) {
        int[][] nums ={ {6, 99, 5},
                {13,98,3,7},
                {17,9,1}};
        int target = 7;
        int[] ans = search_2d(nums,target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(nums));


    }
    static int[] search_2d(int[][] arr,int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
