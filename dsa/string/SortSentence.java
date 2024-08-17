//https://leetcode.com/problems/sorting-the-sentence/
class Solution {
    public String sortSentence(String s) {
        String array[]=s.split(" ");
        int n=array.length;
        String[] newArray=new String[n];

        for(int i=0;i<n;i++)
        {
            int wordlength=array[i].length();
            String word=array[i].substring(0,wordlength-1);
            int index=array[i].charAt(wordlength-1)-'0'-1;
            newArray[index]=word;
        }

       String str=String.join(" ",newArray);

        return str;
    }
}
