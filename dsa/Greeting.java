package com.dsa;

import java.util.Scanner;

public class Greeting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String name = sc.nextLine();
        greet(name);
    }
    static void greet(String name){
        System.out.println("hello "+name);
    }
}