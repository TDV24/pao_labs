package com.company;

public abstract class CandyBox {
    private String flavor;
    private String origin;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
     public CandyBox(){
        this.flavor = "";
        this.origin = "";
     }

     public CandyBox(String flavor, String origin){
        this.flavor = flavor;
        this.origin = origin;
     }

     public abstract int getVolume();

    @Override
    public String toString() {
        return super.toString();
    }
}
