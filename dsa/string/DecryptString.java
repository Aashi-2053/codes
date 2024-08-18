//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
class Solution {
    public String freqAlphabets(String s) {
       StringBuilder res=new StringBuilder();
       int i=0,n=s.length();
       while(i<n) {
        if(i+2<s.length() && s.charAt(i+2)=='#')
        {
            res.append(get(s.substring(i,i+2)));
            i+=3;
        }
        else{
            res.append(get(s.substring(i,i+1)));
            i+=1;
        }
       }
       return res.toString();
    }
    public char get(String s)
    {
        return (char)('a'+Integer.parseInt(s)-1);
    }
}
