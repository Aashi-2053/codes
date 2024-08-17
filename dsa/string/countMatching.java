//https://leetcode.com/problems/count-items-matching-a-rule/
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        for(List<String> i:items)
        {
            String type=i.get(0);
            String color=i.get(1);
             String name=i.get(2);

             if("type".equals(ruleKey) && type.equals(ruleValue))
             c++;
             else if("color".equals(ruleKey) && color.equals(ruleValue))
             c++;
           else if("name".equals(ruleKey) && name.equals(ruleValue))
             c++;
        }
        return c;
    }
}
