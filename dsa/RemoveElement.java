//https://leetcode.com/problems/remove-element/
//27. Remove Element
class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {nums[c]=nums[i];
            c++;
            }
        }
        return c;
    }
}
/*
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
*/
