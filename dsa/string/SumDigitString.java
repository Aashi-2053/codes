//https://leetcode.com/problems/sum-of-digits-of-string-after-convert/description/
class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
       int sum=0;
        for(int i=0;i<s.length();i++)
        {       
            sb.append(((int)(s.charAt(i)) - 96));
        }
        for(int i=0;i<sb.length();i++)
        {
             sum += ((sb.charAt(i))-'0');
        }
       k--;
        while(k!=0){
            int num = sum;
            sum = 0;
            while(num!=0){
                int a = num%10;
                num/=10;
                sum += a;
            }
            k--;
        }
        return sum;

    }
}
