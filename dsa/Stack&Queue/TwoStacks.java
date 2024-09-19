//hackerrank
package com.dsa.stack;
import java.util.*;
public class TwoStacks {
    static int twoStack(int x,int[] a,int[] b){
        return twoStack(x,a,b,0,0)-1;
    }
    private static int twoStack(int x,int[] a,int[] b,int sum,int c){
        if(sum>x) return c;
        if (a.length==0||b.length==0)return c;
        int a1=twoStack(x,Arrays.copyOfRange(a,1,a.length),b,sum+a[0],c+1);
        int a2=twoStack(x,a,Arrays.copyOfRange(b,1,b.length),sum+b[0],c+1);

        return Math.max(a1,a2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int m = s.nextInt();
            int x = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            //i/p
            // 1
            //5 4 10
            //4 2 4 6 1
            //2 1 8 5
            //o/p
            //4
            for (int j = 0; j < n; j++) {
                a[j] = s.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = s.nextInt();
            }
            System.out.println(twoStack(x, a, b));
        }
    }

}
