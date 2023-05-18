package com.example.ikramova.Olimpiada;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int S=A+1;
        int D=A-1;
        System.out.println("The next number for the number"+ A+ " is "+S);
        System.out.println("The previous number for the number"+ A+ " is "+D);

    }
}
