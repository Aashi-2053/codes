package com.dsa;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rupee : ");
        float r = sc.nextFloat();
        System.out.println("Currency in USD : "+dollar(r));
    }
    static float dollar(float r){
        return r/75;
    }
}
