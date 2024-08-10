//441
class Solution {
    public int arrangeCoins(int n) {
       long s=1,e=n;

       while(s<=e)
        {long mid=s+(e-s)/2;
      long sum=(mid*(mid+1)/2);
            if(sum>n)e=mid-1;
            else s=mid+1;
           
        }
        return (int)s-1;
    }
}
