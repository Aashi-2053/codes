package com.dsa;

public class a_power_b {
    //3^6
    public static void main(String[] args) {
        int ans=1;
        int b=3,p=6;
        while(p>0)
        {
          if((p&1)==1)
          {
              ans*=b;
          }
          b=b*b;
          p=p>>1;
        }
        System.out.println(ans);
    }
}
