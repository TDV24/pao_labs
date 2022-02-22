package com.company;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        // ex 2

        int a, b;
        Scanner S = new Scanner(System.in);
        a = S.nextInt();
        b = S.nextInt();
        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}

