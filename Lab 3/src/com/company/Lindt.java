package com.company;

import java.util.Objects;

public class Lindt extends CandyBox{

    private int length;
    private int width;
    private int height;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Lindt() {
        this.height = 0;
        this.length = 0;
        this.width = 0;
    }

    public Lindt(String flavor, String origin, int length, int width, int height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public int getVolume() {
        return this.height * this.length * this.width;
    }

    @Override
    public String toString() {
        return "The Lindt box from " + this.getOrigin() + ", " + this.getFlavor() + " flavoured, has a volume of " + this.getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lindt lindt = (Lindt) o;
        return length == lindt.length && width == lindt.width && height == lindt.height;
    }
}
