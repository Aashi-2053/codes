package com.dsa;

import java.util.Scanner;

public class Prime_between {
    static void prime_num(int n,int m){
        for (int i = n; i <=m; i++) {

            if (i == 1 || i == 0)
                continue;

            // flag variable to tell
            // if i is prime or not
          int flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 number : ");
        int n = sc.nextInt();
        int m=sc.nextInt();
        prime_num(n,m);
    }
}
