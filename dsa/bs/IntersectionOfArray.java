//duplicate allowed
//350
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j])++i;
            else if(nums1[i]>nums2[j])++j;
            else{
                ans.add(nums1[i]);
                ++i;++j;
            }
        }
        int [] res=new int[ans.size()];
        for(i=0;i<res.length;i++)
        {
            res[i]=ans.get(i);
        }
        return res;
    }
}
