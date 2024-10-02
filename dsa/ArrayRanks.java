//https://leetcode.com/problems/rank-transform-of-an-array/description/?envType=daily-question&envId=2024-10-02
//Input: arr = [40,10,20,30]
//Output: [4,1,2,3]
//Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] sorted=arr.clone();
        Arrays.sort(sorted);
        int uni=0;
        for(int i=0;i<n;i++)
        {
            if(i==0 || sorted[i]!=sorted[i-1]){
                sorted[uni++]=sorted[i];
            }
        }
        int[] ranks=new int[n];
         for(int i=0;i<n;i++)
        {
            ranks[i]=Arrays.binarySearch(sorted,0,uni,arr[i])+1;
        }
        return ranks;
    }
}
