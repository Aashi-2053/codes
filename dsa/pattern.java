package com.dsa;

import java.util.Scanner;

public class pattern {
    static void butterfly(int n){
        /*
        *------*
        **----**
        ***--***
        ********
        ********
        ***--***
        **----**
        *------*
         */

        //upper half
        for(int i=1;i<=n;i++) {
            //1st
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            int sp = 2 * (n - i);
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            //2nd
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--) {
            //1st
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            int sp = 2 * (n - i);
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            //2nd
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void rhombus(int n){
        /*
         ---****
         --****
         _****
         ****
         */
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void num_pyramid(int n){
        /*
        ----1
        ---2 2
        --3 3 3
        -4 4 4 4
        5 5 5 5 5

         */
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
                System.out.print(" ");

            }
            System.out.println();
        }
    }
    static void palindromic_pyramid(int n){
        /*
         ----1
         ---212
         --32123
         -4321234
         543212345
         */
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            //1st
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            //2nd
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void diamond_pyramid(int n){
        /*
         ----*
         ---***
         --*****
         -*******
         --*****
         ---***
         ----*

         */
        //upper
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter n : ");
        int n=s.nextInt();
        butterfly(n);
        System.out.println();
        rhombus(n);
        System.out.println();
        num_pyramid(n);
        System.out.println();
        palindromic_pyramid(n);
        System.out.println();
        diamond_pyramid(n);
    }
}
