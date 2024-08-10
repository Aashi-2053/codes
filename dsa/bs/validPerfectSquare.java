class Solution {
    public boolean isPerfectSquare(int a) {
       int min=1;
int max=(int)Math.sqrt(Math.pow(2,31)-1);
while(min<=max)
{
    int mid=min+(max-min)/2;
    if(mid*mid==a)return true;
    else if(mid*mid<a)min=mid+1;
    else max=mid-1;
}       
        return false;
    }
}
