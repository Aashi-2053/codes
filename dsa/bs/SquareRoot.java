package com.dsa.bs;

public class SquareRoot {
    public static void main(String[] args) {
        int n=40,p=3;
        System.out.printf("%.3f",sqr(n,p));
    }
    //O(logn)
    static double sqr(int n,int p){
        int s=0,e=n;
        double root=0.0;
        while(s<=e){
            int mid=(s+e)/2;
            if(mid*mid==n) return mid;
            else if(mid*mid>n) e=mid-1;
            else s=mid+1;
        }
        double incr=0.1;
        for(int i=0;i<p;i++)
        {
            //precision
           while(root*root <=n) {
                root += incr;
            }
           root-=incr;
           incr/=10;
        }
        return root;
    }
        }

