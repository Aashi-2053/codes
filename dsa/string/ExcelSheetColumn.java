//https://leetcode.com/problems/excel-sheet-column-title/
class Solution {
    public String convertToTitle(int columnNumber) {
        String res="";
        while(columnNumber>0)
        {columnNumber--;

            int rem=columnNumber%26;
            char ch=(char)(rem+'A');
            res=ch+res;
            columnNumber/=26;
        }
        return res;
    }
}
