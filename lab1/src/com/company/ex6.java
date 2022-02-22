package com.company;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        int n, suma, contor;
        int note[] = new int[50];
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        suma = 0;
        contor = 0;
        for(int i = 0; i < n; i++)
        {
            int x;
            x = S.nextInt();
            if(x == -1)
            {
               if(contor == 0)
                   contor = 1;
               System.out.print(suma/contor);
               break;
            }
            else
            {
                note[i] = x;
                suma += note[i];
                contor += 1;
            }
        }
    }
}
