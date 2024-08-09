package com.dsa;

import java.util.Scanner;

public class Larger_3 {
    static void larger_3(int a,int b,int c){
        if(a>b) {
            if (a > c)
                System.out.println("a is larger");
            else
                System.out.println("c is larger");
        }
        else {
            if(b>c)
                System.out.println("b is larger");
            else
                System.out.println("c is larger");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        larger_3(a, b,c);
    }
}
