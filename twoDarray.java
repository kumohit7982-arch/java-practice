package com.array;
import java.util.*;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colms = sc.nextInt();

        int [][] number = new int[rows][colms];

        //input
        //rows
        for (int i=0; i<rows; i++){
            //colms
            for (int j=0; j<colms; j++){
                number[i][j]=sc.nextInt();
            }
        }

        //output
        for (int i=0;i<rows; i++){
            for (int j=0; j<colms; j++){
                System.out.print(number[i][j]+" ");

            }
            System.out.println();
        }


    }
}
