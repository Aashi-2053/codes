package com.dsa.recur;

import com.dsa.Array_list;

import java.util.ArrayList;

public class SubsequenceString {
    public static void main(String[] args) {
        System.out.println(subSeqReturn("","abc"));
        subSeq("","abc");
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char c=up.charAt(0);

        subSeq(p+c,up.substring(1));

        subSeq(p,up.substring(1));

    }
    static ArrayList<String> subSeqReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char c=up.charAt(0);
        ArrayList<String> left=subSeqReturn(p+c,up.substring(1));

        ArrayList<String> right=subSeqReturn(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
