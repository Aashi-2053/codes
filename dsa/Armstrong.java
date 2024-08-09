package com.dsa;

import java.util.Scanner;

public class Armstrong {
    static void check_Arm(int n,int m){
        for (int i = n; i<m; i++){
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if(sum == i){
                System.out.println(i+" is an Armstrong number.");
            }

        }
    }
    public static void main(String args[]) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        num1 = sc.nextInt();
        System.out.println("Enter the second number :");
        num2 = sc.nextInt();
     check_Arm(num1,num2);
        System.out.println("All 3 digit Armstrong number: ");
        check_Arm(100,1000);
    }
}
