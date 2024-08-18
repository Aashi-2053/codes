//https://leetcode.com/problems/determine-if-string-halves-are-alike/
class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int a=0,b=0;
        int mid=n/2;
        String vowel="aeiouAEIOU";
        for(int i=0;i<mid;i++)
        {
            if(vowel.indexOf(s.charAt(i))>=0) a++;
        }
         for(int i=mid;i<n;i++)
        {
            if(vowel.indexOf(s.charAt(i))>=0) b++;
        }
        return a==b;
    }
}
