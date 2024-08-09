package com.dsa;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal, time and rate : ");
        float p=sc.nextFloat();
        float t=sc.nextFloat();
        float r=sc.nextFloat();
        System.out.println("Simple Interest : "+ interest(p,t,r));
    }
    static float interest(float p ,float t,float r)
    {
        float SI;
        SI=(p*r*t)/100;
        return SI;
    }
}
