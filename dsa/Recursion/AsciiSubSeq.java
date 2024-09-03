package com.dsa.recur;

public class AsciiSubSeq {
    public static void main(String[] args) {
        subSeqASCII("","ab");
    }
    static void subSeqASCII(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char c=up.charAt(0);

        subSeqASCII(p+c,up.substring(1));
        subSeqASCII(p,up.substring(1));
        subSeqASCII(p+(c+0),up.substring(1));

    }

}
