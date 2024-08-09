package com.dsa;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b=sc.nextInt();
        larger(a,b);

    }
    static void larger(int a,int b){
        if(a>b)
            System.out.println("a is larger");
        else
            System.out.println("b is larger");
    }
}
