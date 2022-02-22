package com.company;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        // ex 1

        int n;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        for(int i = 0; i <= n; i++)
            if((i % 2) == 0) {
                System.out.print(i + " ");
            }
    }
}
