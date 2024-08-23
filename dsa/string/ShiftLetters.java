//https://leetcode.com/problems/shifting-letters/
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int shift=0;
        char[] str=s.toCharArray();

        for(int i=s.length-1;i>=0;i--)
        {
            shift=(shift+shifts[i]%26);// c-> shift=9
            str[i]=(char)(str[i]-'a'+shift)%26+'a';//c=(c-'a'+9)%26+'a'=(99-97+9)%26+97=11%26+97=11+97=108=l
        }
        return new String(str);
    }
}
