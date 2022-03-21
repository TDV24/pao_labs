package com.company;

import java.util.Objects;

public class Milka extends CandyBox{

    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Milka() {
        this.height = 0;
        this.radius = 0;
    }

    public Milka(String flavor, String origin, int radius, int height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public int getVolume() {
        return (int) 3.14 * this.radius * this.radius * this.height;
    }

    @Override
    public String toString() {
        return "The Milka box from " + this.getOrigin() + ", " + this.getFlavor() + " flavoured, has a volume of " + this.getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milka milka = (Milka) o;
        return radius == milka.radius && height == milka.height;
    }

}
