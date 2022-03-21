package com.company;

import java.util.ArrayList;

public class Area {
    private CandyBag candyBag;
    private int number;
    private String street;

    public CandyBag getCandyBag() {
        return candyBag;
    }

    public void setCandyBag(CandyBag candyBag) {
        this.candyBag = candyBag;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Area(CandyBag candyBag, int number, String street) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    public Area(){
        ArrayList<CandyBox> candyBoxes = new ArrayList<CandyBox>();
        CandyBag c1 = new CandyBag(candyBoxes);
        this.candyBag = c1;
        this.number = 0;
        this.street = "";
    }

    public void printAddress(){
        System.out.println("For the street " + this.street + ", number " + this.number + ", we have the following boxes to deliver:");
        this.candyBag.showCandyBoxes();
    }
}
