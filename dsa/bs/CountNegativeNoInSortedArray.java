//1351
class Solution {
    public int countNegatives(int[][] a) {
        int r=a.length,c=a[0].length;
        int i=0,j=c-1;
        int ct=0;
        while(i<r && j>=0)
        {
            if(a[i][j]<0){ct+=r-i;
            j--;}
            else i++;
            
        }
        return ct;
    }
}
