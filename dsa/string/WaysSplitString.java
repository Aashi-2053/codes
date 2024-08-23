//https://leetcode.com/problems/number-of-ways-to-split-a-string/
class Solution {
    public int numWays(String s) {
        long ones=0;
        long n=s.length();
        long m=1_000_000_007;
        for(char c:s.toCharArray())
        ones+=c-'0';

        if(ones==0)return (int)((((n-1)*(n-2))/2)%m);
        if(ones%3!=0) return 0;
         long onethird=ones/3;
         ones=0;
         long w1=0,w2=0;

         for(char c:s.toCharArray())
         {
            ones+=c-'0';
            if(ones==onethird) w1++;
            if(ones==2*onethird)w2++;
         }
         return (int)((w1*w2)%m);
    }
}
