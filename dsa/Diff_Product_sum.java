package com.dsa;

import java.util.Scanner;

public class Diff_Product_sum {
   static int product(int n){
       int r=0,s=1;
       while(n!=0){
          r=n%10;
           s = s*r;
           n=n/10;
       }
       return s;
    }
            static int sum(int n){
            int r=0,s=0;
            while(n!=0){
                r=n%10;
                s = s+r;
                n=n/10;
            }
            return s;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int y=product(n)- sum(n);
        System.out.println("Subtract the product and sum of digits of integer : "+y);
    }

}
