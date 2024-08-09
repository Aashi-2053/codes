package com.dsa.bs;
public class SplitArray {
    public static void main(String[] args) {

    }
    public int splitArray(int [] a,int m)
    {int s=0,e=a.length-1;

        for(int i=0;i<a.length;i++)
        {
            s=Math.max(s,a[i]);
            e+=a[i];
        }
        //bs
        while(s<e)
        {
            int mid=s+(e-s)/2;
            //calculate k
            int sum=0;
            int k=1;
            for (int i=0;i<a.length;i++)
            {
                if(sum+a[i]>mid)
                {
                    //cant add
                    sum=a[i];
                    k++;
                }
                else{
                    sum+=a[i];
                }
            }
            if(k>m)
            {
                s=mid+1;
            }
            else{
                e=mid;
            }
        }

        return e;//s==e
    }
}
