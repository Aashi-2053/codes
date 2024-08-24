//https://leetcode.com/problems/basic-calculator/
//hard
class Solution {
    public int calculate(String s) {
        int n=s.length();
        int sign=1,ans=0,curr=0;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                curr=s.charAt(i)-'0';
                while(i+1<n&&Character.isDigit(s.charAt(i+1)))
                {
                    curr=curr*10+s.charAt(i+1)-'0';
                    i++;
                }
                curr=curr*sign;
                ans+=curr;
                curr=0;
                sign=1;
            }
            else if(s.charAt(i)=='+') 
              sign=1;
            else if(s.charAt(i)=='-') 
              sign=-1;
          else if(s.charAt(i)=='(') 
            {
                st.push(ans);
                st.push(sign);
                ans=0;
                sign=1;
            }
         else if(s.charAt(i)==')') 
         {
            int prevSign=st.pop();
            ans=prevSign*ans;
            int prevAns=st.pop();
            ans+=prevAns;
         }
        }
        return ans;
    }
}
