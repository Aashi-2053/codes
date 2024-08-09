package com.dsa;

import java.util.Scanner;

public class String_Builder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String st=sc.nextLine();
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        //char at 0 index
        System.out.println(sb.charAt(0));
        // set char at 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        //insert
        sb.insert(2,'n');
        System.out.println(sb);
        //delete
        sb.delete(1,2);
        System.out.println(sb);

        System.out.println();
        System.out.println();
        StringBuilder s=new StringBuilder("H");
        s.append("e");
        s.append("l");
        s.append("l");
        s.append("o");
        System.out.println(s.length());
        System.out.println();
        System.out.println();
        //reverse
        for (int i=0;i<s.length()/2;i++){
            int start=i;
            int end=s.length()-1-i;
            char st_char=s.charAt(start);
            char end_char=s.charAt(end);
            s.setCharAt(start,end_char);
            s.setCharAt(end,st_char);

        }
        System.out.println(s);

    }
}
