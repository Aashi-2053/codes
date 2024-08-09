package com.dsa.bs;

import java.util.Arrays;

//row and col wise sorted matrix search
public class RowColMatrix {
    public static void main(String[] args) {
int a[][]={
        {10,20,30,40},{15,25,35,45},{28,29,39,49},{33,34,40,50}
};
        System.out.println(Arrays.toString(search(a,88)));
    }
    static int[] search(int[][] a,int k)
    {
        int r=0,c=a.length-1;
        while(r<a.length && c>=0)
        {
            if(a[r][c]==k)
                return new int[]{r,c};
            else if(a[r][c]<k)
            {
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
