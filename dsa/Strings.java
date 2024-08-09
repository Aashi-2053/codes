package com.dsa;

public class Strings {
    public static void main(String[] args) {
        String first="Tony";
        String last="Stark";
        //concat
        String full=first+last;
        System.out.println(full);
        for (int i=0;i<full.length();i++){
            System.out.println(full.charAt(i));
        }
        //compare
        // s1>s2 ->+ve
        // s1==s2 ->0
        // s1<s2 -> -ve

        if(first.compareTo(last)==0)
            System.out.println("Strings equal");
        else
            System.out.println("Strings not equal");
    }
}
