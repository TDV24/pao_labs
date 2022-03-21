package com.company;

import java.util.ArrayList;

public class CandyBag {
    ArrayList<CandyBox> candyBoxes;

    public ArrayList<CandyBox> getCandyBoxes() {
        return candyBoxes;
    }

    public void setCandyBoxes(ArrayList<CandyBox> candyBoxes) {
        this.candyBoxes = candyBoxes;
    }

    public CandyBag(ArrayList<CandyBox> candyBoxes) {
        this.candyBoxes = candyBoxes;
    }

    public void showCandyBoxes(){
        for(int i = 0; i < this.candyBoxes.size(); i++)
        {
            System.out.println(this.candyBoxes.get(i).toString());
        }
    }
}
