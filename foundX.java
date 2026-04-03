package com.array;

import java.util.*;

public class foundX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colms = sc.nextInt();

        int[][] number = new int[rows][colms];

        for (int i=0; i<rows; i++){
            for (int j=0; j<colms; j++){
                number[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i=0; i<rows; i++){
            for (int j=0; j<colms; j++){
                if (x==number[i][j]){
                    System.out.print("x found at "+i+","+j+" ");
                }
            }
            System.out.println();
        }

    }
}
