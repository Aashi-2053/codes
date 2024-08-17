class Solution {
  public boolean isPalindrome(String s){
  s=s.toLowerCase();
  if(s==null || s.length==0)
    return true
  for(int i=0;i<s.length()/2;i++) 
      { char start=s.charAt(i);
       char end=s.charAt(s.length-1-i);
       if(start!=e) return false;
      }
    return true;
  }
}
    
    
