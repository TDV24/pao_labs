package com.company;
import java.util.Scanner;

public class ex4 {

    static int Mult(int n){
        int suma;
        suma = 0;
        for(int i = 1; i <= n; i++)
            if((i % 3) == 0 || (i % 5) == 0)
                suma += i;
        return suma;
    }

    public static void main(String[] args) {
        //ex 4
        int n;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        System.out.println(Mult(n));
    }
}
