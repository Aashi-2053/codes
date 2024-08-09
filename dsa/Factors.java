package com.dsa;

import java.util.Scanner;

public class Factors {
    static void factors(int n){
        System.out.println("Factors of "+n+" are : ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+ ", ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        factors(n);
    }
}
