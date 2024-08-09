package com.dsa;

import java.util.Scanner;

public class Palindrome_string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        s=s.toLowerCase();
        boolean flag=true;

        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println(s+" is a palindrome");
        else
            System.out.println(s+" is not a palindrome");
    }
}
