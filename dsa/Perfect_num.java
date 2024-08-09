package com.dsa;

import java.util.Scanner;

public class Perfect_num {
    static boolean checkPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(checkPerfect(n))
            System.out.println(n+" is perfect number ");
        else
            System.out.println(n+" is not a perfect number ");
    }
}
