//41
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==c)
            {
                c++;
            }
        }
        return c;
    }
}
