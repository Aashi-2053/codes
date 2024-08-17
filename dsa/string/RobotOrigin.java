//https://leetcode.com/problems/robot-return-to-origin/
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);

            if(ch=='R')x++;
            else if(ch=='L')x--;
           else if(ch=='U')y++;
            else if(ch=='D')y--;

        }
        return x==0 &&y==0;
    }
}
