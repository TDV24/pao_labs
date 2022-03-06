package com.company;

public class Main {

    public static void main(String[] args) {
        Adevar a = Adevar.getAdevar();
        Adevar b = Adevar.getAdevar();
        System.out.println(a == b);
        a.showAdevar();
    }
}
