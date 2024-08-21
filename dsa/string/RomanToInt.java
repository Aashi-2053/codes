//https://leetcode.com/problems/roman-to-integer/
class Solution {
    public int value(char ch)
    {
        if(ch=='I')return 1;
        else  if(ch=='V')return 5;
        else if(ch=='X')return 10;
        else  if(ch=='L')return 50;
        else if(ch=='C')return 100;
        else  if(ch=='D')return 500;
        if(ch=='M')return 1000;
        return 0;
    }
    public int romanToInt(String s) {
        int res=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(i+1<n && value(ch)<value(s.charAt(i+1)))
            res=res-value(ch);
           else 
           res=res+value(ch);
        }
        return res;
    }
}
