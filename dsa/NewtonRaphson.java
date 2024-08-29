package com.dsa.bs;

public class NewtonRaphson {
    //sqr root
    public static void main(String[] args) {
        System.out.println(nr_sqr(40));
    }
    static double nr_sqr(double n){
        double x=n,root;
        while(true){
            root=0.5*(x+(n/x));

            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;
        }
        return root;
    }


}
