package com.dsa.sort;

public class Quick_sort {
   // The key process in quickSort is a partition().
    // The target of partitions is to place the pivot (any element can be chosen to be a pivot)
    // at its correct position in the sorted array and put all smaller elements to the
    // left of the pivot, and all greater elements to the right of the pivot.
    //Partition is done recursively on each side of the pivot after the pivot is placed
    // in its correct position and this finally sorts the array
   static int partition(int [] a,int l,int h){
      //worst - O(n^2) when pivot smallest
       // avg- O(nlogn)

      int p=a[h];
      int i=l-1;
      for (int j=l;j<=h;j++)
      {
          if(a[j]<p)
          {
              i++;
              int temp=a[i];
              a[i]=a[j];
              a[j]=temp;
          }
      }
      i++;
       int temp=a[i];
       a[i]=a[h];
      a[h]=temp;
       return i;
   }
    static void quick(int [] a,int l,int h)
    {
        if(l<h) {
            int pi = partition(a,l,h);
           quick(a, l,pi-1);
            quick(a,pi+1,h);
        }
    }
    static void print(int [] a)
    {
        for (int j : a) System.out.println(j + " ");
    }
    public static void main(String[] args) {
        int[] a={7,8,3,1,2};
        System.out.print("Before: ");
        System.out.println();
        print(a);
        quick(a,0,a.length-1);
        System.out.println();
        System.out.print("After: ");
        System.out.println();
        print(a);
    }
}
