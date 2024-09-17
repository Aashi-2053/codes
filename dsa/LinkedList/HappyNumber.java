//https://leetcode.com/problems/happy-number/
/*
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/
class Solution {
    public boolean isHappy(int n) {
         int slow=n,fast=n;

        do{
            slow=sq(slow);
            fast=sq(sq(fast));
        }
        while(fast!=slow);
        if(slow==1){
            return true;
        }
        return false;
        }

    private int sq(int n){
        int ans=0;
        while (n>0){
            int r=n%10;
            ans=ans+r*r;
            n=n/10;
        }
        return ans;
    
    }
}
