
package com.dsa.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a={7,8,3,12,1,2};
        a=mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
    //kunal
    static int[] mergeSort(int [] a)
    {
        if(a.length==1) return a;
        int mid=a.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(a,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(a,mid,a.length));
        return merge(left,right);
    }
    static int[] merge(int [] left,int[] right) {//O(nlogn)
        //divide and conquer
        int [] mix =new int [left.length+ right.length];
        int i=0,j=0,k=0;
        while(i< left.length && j<right.length)
        {
            if(left[i]<=right[j])
            {
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length)
        {
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j< right.length)
        {
            mix[k]=right[j];
            j++;
            k++;
        }
       return mix;
    }
}
