//https://leetcode.com/problems/minimum-time-difference/
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
           String ctime=timePoints.get(i);

            int val=Integer.parseInt(ctime.substring(0,2))*60;
              int time=Integer.parseInt(ctime.substring(3));
              arr[i]=val+time;
        }
        Arrays.sort(arr);

        int min=(int)1e9;

        for(int i=1;i<n;i++)
        {
            min=Math.min(min, arr[i]-arr[i-1]);
        }
         min=Math.min(min, (24*60 - arr[n-1])+arr[0]);
          return min;
    }
   

}
