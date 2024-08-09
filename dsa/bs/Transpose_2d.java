package com.dsa.bs;
import java.util.Scanner;

public class Transpose_2d {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n : ");
        int n = sc.nextInt();
        int m = sc.nextInt();


        int matrix[][] = new int[n][m];
        System.out.println("Enter elements : ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("The transpose is : ");
        //To print transpose
        for(int j=0; j<m ;j++) {
            for(int i=0; i<n; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}


