package com.company;
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        int pare[] = new int[50];
        int impare[] = new int[50];
        int n, a, b;
        a = 0;
        b = 0;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        for(int i = 1; i <= n; i++)
        {
            int x;
            x = S.nextInt();
            if((x % 2) == 0)
            {
                pare[a] = x;
                a++;
            }
            else
            {
                impare[b] = x;
                b++;
            }
        }
        for(int i = 0; i < a; i++)
            System.out.print(pare[i] + " ");
        System.out.println(" ");
        for(int i = 0; i < b; i++)
            System.out.print(impare[i] + " ");
    }
}
