package com.dsa;

import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers
// from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class Sum_neg_posi_odd_even {
    static void sum_all() {
        Scanner sc = new Scanner(System.in);
        int n, s_p_odd = 0, s_neg=0,s_p_even=0;

       while(true) {
           System.out.print("Enter number or enter 0 to end the loop : ");
           n = sc.nextInt();
           if(n==0) break;
           if(n<0) s_neg+=n;
           else if(n%2==0)s_p_even+=n;
           else
               s_p_odd+=n;
                  }
        System.out.println("Sum of negative number : "+s_neg);
        System.out.println("Sum of positive odd number : "+s_p_odd);
        System.out.println("Sum of positive even number : "+s_p_even);

    }
    public static void main(String[] args) {
       sum_all();
    }
}
