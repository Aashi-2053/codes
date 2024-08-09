package com.dsa;

public class bit_position {
    public static void main(String[] args) {
        int n=5;//0101
        int pos=2;
        int bit_get=1<<pos;
        System.out.println("get bit : 1<<pos & n ");

        if((bit_get & n)==0)
            System.out.println("0");
        else
            System.out.println("1");

        System.out.println("set bit : 1<<pos | n ");
        pos=1;
        int bit_set=1<<pos;
        int new_num=bit_set | n;
        System.out.println(new_num);

        System.out.println("clear bit : ~(1<<pos) & n ");
        pos=2;
        int bit_clear=1<<pos;
        int notbit=~(bit_clear);

        int new_number=notbit & n;
        System.out.println(new_number);

        System.out.println("update bit : ");
        System.out.println("if 0 bit : ~(1<<i) & n ");
        System.out.println("if 1 bit : (1<<i) | n ");
        pos=1;
        int op=1;
        int bit_update=1<<pos;
        if(op==1){
            //set
            int num=bit_update | n;
            System.out.println(num);
        }
        else {
            //clear
            notbit=~(bit_update);
            new_number=notbit & n;
            System.out.println(new_number);
        }


    }
}
