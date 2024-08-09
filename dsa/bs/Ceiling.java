package com.dsa.bs;

public class Ceiling {
        static int ceiling(int [] a,int target)
        {
            if(target > a[a.length-1])
                return -1;
            int s=0,e=a.length-1;
            while(s<=e){
                int mid=(s+e)/2;
                if(a[mid]==target) return mid;
                else if(a[mid]>target) e=mid-1;
                else s=mid+1;
            }
            return s;
        }
    static int floor(int [] a,int target)
    {
        if(target > a[a.length-1])
            return -1;
        int s=0,e=a.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==target) return mid;
            else if(a[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return e;
    }
        public static void main(String[] args) {
            int[] a={1,5,22,33,63,74,85};
            int target=45;
            //smallest num >=target
            System.out.println(ceiling(a,target));
          //  greatest number <= target
            System.out.println(floor(a,target));
        }
    }

