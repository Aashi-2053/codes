package com.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(5);
        list.add(3);
        list.add(7);
        System.out.println(list);
        //get elements
        int ele = list.get(0);
        System.out.println(ele);
        //add ele in between
        list.add(1,1);
        System.out.println(list);
        //set
        list.set(0,7);
        System.out.println(list);
        //delete
        list.remove(3);
        System.out.println(list);
        //size
        System.out.println(list.size());
        //sort
        Collections.sort(list);
        System.out.println(list);

    }
}
