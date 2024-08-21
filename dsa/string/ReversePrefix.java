//https://leetcode.com/problems/valid-parentheses/
class Solution {
    public String reversePrefix(String word, char ch) {
        int i=word.indexOf(ch);
        String ans="";
        int j=0;
        while(j<=i)
        {
           char str=word.charAt(j);
           ans= str+ans;
           j++;
        }
       

       ans=ans+word.substring(i+1,word.length());
        return ans;
    }
}
