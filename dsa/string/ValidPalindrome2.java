//https://leetcode.com/problems/valid-palindrome-ii/
class Solution {
     public boolean isPalindrome(String s,int i,int j){

 
  while(i<j)
      { char start=s.charAt(i);
       char end=s.charAt(j);
       if(start==end){
        i++;
        j--;
       }
       else return false;
      }
    return true;
  }
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;

        while(i<j)
        {
            char start=s.charAt(i);
            char end=s.charAt(j);
            if(start==end)
            {
                i++;j--;
            }
            else return isPalindrome(s,i+1,j)||isPalindrome(s,i,j-1);
        }
        return true;
    }
}
