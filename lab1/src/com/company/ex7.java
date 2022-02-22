package com.company;

import java.util.Scanner;

public class ex7 {
    static int Fibonacci(int n){
     if(n == 0) return 0;
     if(n == 1 || n == 2) return 1;
     return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args){
        int n;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        System.out.print(Fibonacci(n));
    }
}
