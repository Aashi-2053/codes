//https://leetcode.com/problems/snake-in-matrix/
/*
Input: n = 2, commands = ["RIGHT","DOWN"]

Output: 3

Explanation:

|'0'| 1|     | 0 |'1'|     | 0 | 1|  
| 2	| 3|      | 2	| 3|     | 2 |'3'|



*/
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
    int pos=0;

    for(String command: commands){
        if(command.equals("RIGHT"))pos+=1;
        if(command.equals("LEFT"))pos-=1;
        if(command.equals("DOWN"))pos+=n;
          if(command.equals("UP"))pos-=n;
    }

    return pos;
    }
}
