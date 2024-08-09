package com.dsa;

import java.util.Scanner;

public class Palindrome_number {
    static int palindrome(int n){
        int r=0,s=0;

        while(n!=0){
            r=n%10;
            s=s*10+r;
            n=n/10;
            }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int m=palindrome(n);
        if(n==m)
            System.out.println(n+" is a palindrome");
        else
            System.out.println(n+" is not a palindrome");
    }
}
