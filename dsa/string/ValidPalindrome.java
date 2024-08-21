//https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
       
        s=s.toLowerCase();
       StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z')|| (s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
               sb.append(s.charAt(i));
            }
        }
        
  for(int i=0;i<sb.length()/2;i++) 
      { char start=sb.charAt(i);
       char end=sb.charAt(sb.length()-1-i);
       if(start!=end) return false;
      }
 
        return true;
    }
}
