package com.array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        // input names
        System.out.println("Enter the names: ");
        for (int i=0; i<n; i++){
            name[i] = sc.nextLine();

        }
        // output name
        System.out.println("names are:");
        for (int i=0; i<n; i++){
            System.out.println(name[i]);
        }
        sc.close();


    }
}
