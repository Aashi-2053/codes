package com.dsa;

import java.util.Scanner;


//Take integer inputs till the user enters 0 and print the sum of all numbers
public class Sum_Larger {
    static int sum() {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter number or enter 0 to end the loop : ");
        n = sc.nextInt();
        while (n != 0) {
           sum = sum + n;
            System.out.print("Again Enter number : ");
            n = sc.nextInt();
        }
        return sum;
            }
    static int larger() {
        Scanner sc = new Scanner(System.in);
        int n, Max= 0;
        System.out.print("Enter number or enter 0 to end the loop : ");
        n = sc.nextInt();
        while (n != 0) {
            Max=Math.max(Max,n);
            System.out.print("Again Enter number : ");
            n = sc.nextInt();
        }
        return Max;
    }
    public static void main(String[] args) {
        System.out.println("Sum : "+sum());
        System.out.println("largest : "+larger());
    }
}
