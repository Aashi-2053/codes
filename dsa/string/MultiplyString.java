//https://leetcode.com/problems/multiply-strings/
class Solution {
    public char[] reverse(String n)
    {
        char[] ans=n.toCharArray();
        int s=0,e=n.length()-1;
         while(s<e)
        {
           char str=ans[s];
           ans[s]= ans[e];
           ans[e]=str;
           s++;
           e--;
        }
        return ans;
    }
    public String multiply(String num1, String num2) {
        char s1[]=reverse(num1);
        char s2[]=reverse(num2);
 int[] res=new int[s1.length+s2.length];
        for(int i=0;i<s1.length;i++)
        {
            int carry=0;
            int start=i;
           
            for(int j=0;j<s2.length;j++)
            {
                int n1=s1[i]-'0';
                int n2=s2[j]-'0';
                int sum=(n1*n2)+res[start]+carry;
                int base=sum%10;
                carry=sum/10;
                res[start++]=base;
            }
            if(carry!=0) res[start]=carry;
        }
        int i=res.length-1;
        while(i>0 && res[i]==0)
        {
            i--;
        }
        String ans="";
        while(i>=0)
        {
            ans+=res[i];
            i--;
        }
        return ans;
    }
}
