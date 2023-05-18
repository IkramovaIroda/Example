package com.example.ikramova.Olimpiada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int N = in.nextInt();
        System.out.println( yuza(A, B, N));
    }

    public static int yuza(int A, int B, int N) {
        int S=0;

        if (N <= 100 && A <= 100 && B <= 100) {
            S = 2*(A * B)*N;
        }
        System.out.println(S);
        return S;

    }
}
