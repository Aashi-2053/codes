//https://leetcode.com/problems/print-words-vertically/
class Solution {
    public List<String> printVertically(String s) {
        List<String> ans=new ArrayList<>();
        String[] w=s.split(" ");
        int max_n=getMax(w);

        for(int i=0;i<max_n;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(String word:w)
            {
                if(i>=word.length())
                {
                    sb.append(" ");
                }
                else {
                    sb.append(word.charAt(i));
                }
            }
            ans.add(trimRight(sb.toString()));
            
        }
        return ans;
    }
    public String trimRight(String w)
    {
        int i=w.length();
        while(--i>-1)
        {
            if(w.charAt(i)!=' ')
             return w.substring(0,i+1);
             
        }
        return null;
    }
    public int getMax(String[] w)
    {
        int max=0;
        for(String i:w)
          max=Math.max(max,i.length());
        return max;
    }
}
