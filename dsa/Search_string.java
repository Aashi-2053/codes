package com.dsa;

public class Search_string {
    public static void main(String[] args) {
        String n="Aashi";
        char target='h';
        System.out.println(search(n,target));
    }
    static boolean search(String s,char target){
        if(s.length()==0)
            return false;
        for (int i=0;i<s.length();i++)
        {
            if(target==s.charAt(i))
                return true;
        }
        return false;
    }
}
