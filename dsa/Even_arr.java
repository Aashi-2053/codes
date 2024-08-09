package com.dsa;
//find no of no have even no of digit
//count no of digit
//take length
public class Even_arr {
    public static void main(String[] args) {
        int[] nums = {6, 99, 5, 70, 2, 88, 33, 9};
        System.out.println(find_num(nums));

    }


    static int find_num(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;
    }
    // count number of digits in a number
    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }

        return count;
    }
}
