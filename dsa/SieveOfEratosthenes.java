package com.dsa;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=40;
        boolean[] prime=new boolean[n+1];
        sieve(n,prime);
    }
    //time n/2+n/3+n/5+n/7+..
    //n(1/2+1/3+1/5+1/7+..)
    //O(n*(log(logn)))
    static void sieve(int n,boolean[] prime){
        for(int i=2;i*i<=n;i++)
        {
            if(!prime[i]){
                for(int j=2*i;j<=n;j+=i)
                {
                    prime[j]=true;
                }
            }
        }
        for (int i=2;i<=n;i++)
        {
            if(!prime[i])
                System.out.print(i+" ");
        }
    }
}
