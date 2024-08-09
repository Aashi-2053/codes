package com.dsa;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operator number : \n1. +\n2. -\n3. *\n4. /");
        int o =sc.nextInt();
        calc(a,b,o);
    }
    static void calc(int a,int b,int o){
        if(o==1){
            System.out.println(a+"+"+b+"="+(a+b));
        }
        else if(o==2){
            System.out.println(a+"-"+b+"="+(a-b));
        }
        else if(o==3){
            System.out.println(a+"*"+b+"="+(a*b));
        }
        else if(o==4){
            System.out.println(a+"/"+b+"="+(a/b));
        }
        else
            System.out.println("incorrect operator entered!!!");
    }
}
