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
        System.out.println("Prime numbers: ");
        prime_num(n,m);
    }
}
/*

public class Prime {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
 */
