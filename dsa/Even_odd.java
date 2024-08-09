package com.dsa;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        checkEvenOdd(n);
    }
    static void checkEvenOdd(int n)
    {
        if(n%2==0)
            System.out.println(n+" is even number ");
        else
            System.out.println(n+" is odd number ");
    }
}
