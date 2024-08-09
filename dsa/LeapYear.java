package com.dsa;

import java.util.Scanner;

public class LeapYear {
   static int leap(int y){
       if((y % 400 == 0) ||
               (y % 100 != 0) &&
                       (y % 4 == 0))
       {
           return 1;
       }
       else
       {
           return 0;
       }
   }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int n = sc.nextInt();
        if (leap(n)==1)
            System.out.println(n + " is leap year");
        else
            System.out.println(n + " is not a leap year");
    }
}