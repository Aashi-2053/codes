package com.dsa;

import java.util.Scanner;

public class Factors {
    static void factors1(int n){
        System.out.println("Factors of "+n+" are : ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+ ", ");
            }
        }
    }
    static void factors2(int n){
        System.out.println("Factors of "+n+" are : ");
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i)
                System.out.print(i+ ", ");
                else System.out.print(i+" "+n/i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        factors1(n);
        factors2(n);
    }
}
