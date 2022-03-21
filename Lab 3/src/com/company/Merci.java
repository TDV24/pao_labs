package com.company;

import java.util.Objects;

public class Merci extends CandyBox{

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Merci() {
        this.length = 0;
    }

    public Merci(String flavor, String origin, int length) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public int getVolume() {
        return this.length ^ 3;
    }

    @Override
    public String toString() {
        return "The Merci box from " + this.getOrigin() + ", " + this.getFlavor() + " flavoured, has a volume of " + this.getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Merci merci = (Merci) o;
        return length == merci.length;
    }

}
