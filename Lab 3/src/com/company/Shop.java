package com.company;

import java.util.ArrayList;

public class Shop {

    public static void orders() {
        Milka m1 = new Milka("vanilla", "France", 5, 10);
        Milka m2 = new Milka("chocolate", "Switzerland", 8, 7);
        Milka m3 = new Milka("strawberry", "Switzerland", 12, 5);
        Milka m4 = new Milka("vanilla", "Austria", 20, 7);
        Lindt l1 = new Lindt("cherry", "Germany", 20, 6, 10);
        Merci mc1 = new Merci("white chocolate", "France", 11);
//        System.out.println(m1.equals(m2));
//        System.out.println(m1.toString());
//        System.out.println(m2.toString());
        ArrayList<CandyBox> candyBoxes1 = new ArrayList<CandyBox>();
        ArrayList<CandyBox> candyBoxes2 = new ArrayList<CandyBox>();
        candyBoxes1.add(m1);
        candyBoxes1.add(m2);
        candyBoxes1.add(m3);
        candyBoxes2.add(m4);
        candyBoxes2.add(l1);
        candyBoxes2.add(mc1);
        CandyBag candyBag1 = new CandyBag(candyBoxes1);
        CandyBag candyBag2 = new CandyBag(candyBoxes2);
//        candyBag.showCandyBoxes();
        Area a1 = new Area(candyBag1, 18, "Strada Nicolae Grigorescu");
        a1.printAddress();
        Area a2 = new Area(candyBag2, 29, "Bulevardul Adrian Paunescu");
        a2.printAddress();
    }
}
