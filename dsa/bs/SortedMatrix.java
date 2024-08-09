package com.dsa.bs;

import java.util.Arrays;
// O(logn)+O(logm)
public class SortedMatrix {
    public static void main(String[] args) {
        int a[][]={
                {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println(Arrays.toString(search(a,6)));
    }
    static int[] bs(int[][] a,int r,int cs,int ce,int k) {
        while (cs <= ce) {
            int mid = cs + (ce - cs) / 2;
            if (a[r][mid] == k)
                return new int[]{r, mid};
            else if (a[r][mid] < k) {
                cs = mid + 1;
            } else {
                ce = mid - 1;
            }

        }
        return new int[]{-1, -1};
    }


    static int[] search(int[][] a,int k)
    {
        int r=a.length;
        int c=a[0].length;// a can be 1d
        if(r==1)
        {
return bs(a,0,0,c-1,k);
        }
        int rs=0,re=r-1;
        int midcol=c/2;
        //run till r=2
        while(rs<(re-1))
        {
            int mid=rs+(re-rs)/2;//more than 2 row
            if(a[mid][midcol]==k)return new int[]{mid,midcol};
            else if(a[mid][midcol]<k)rs=mid;
            else re=mid;
        }
        //2 row left
        //check k in 2 row
        if(a[rs][midcol]==k)return new int[]{rs,midcol};
        if(a[rs+1][midcol]==k)return new int[]{rs+1,midcol};
        //check 1st half
        if(k<=a[rs][midcol-1])
return  bs(a,rs,0,midcol-1,k);
            //check 2nd half
   else if(k>=a[rs][midcol+1] && k<=a[rs][c-1])
            return  bs(a,rs,midcol+1,c-1,k);

                //check 3rd half
            else if(k<=a[rs+1][midcol]-1)
            return  bs(a,rs+1,0,midcol-1,k);

                    //check 4th half
else{
            return  bs(a,rs+1,midcol+1,c-1,k);

    }

    }

}
