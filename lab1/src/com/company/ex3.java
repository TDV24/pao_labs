package com.company;
import java.util.Scanner;

public class ex3 {

    static int Fact(int n){
        if (n == 0 || n == 1) return 1;
        return n * Fact(n-1);
    }

    public static void main(String[] args) {

        // ex 3
        int n;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        System.out.println(Fact(n));
    }
}
