package com.example;

import java.util.Scanner;


public class Main 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int a, b, x;
        a = input.nextInt();
        b = input.nextInt();
        input.close();

        x = add(a, b);

        System.out.printf("X = %d\n", x);

    }

    public static int add(int a, int b){
        return a + b;
    }
}
