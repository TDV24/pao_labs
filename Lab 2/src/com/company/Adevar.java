package com.company;

public class Adevar {
    private static String factos;
    private static Adevar adevar;

    private Adevar(){
        factos = "FCSB este Steaua!";
    }

    public static Adevar getAdevar(){
        if(adevar == null)
            adevar = new Adevar();
        return adevar;
    }

    public static void showAdevar(){
        System.out.println("Doresc sa te anunt ca " + factos);
    }

}
