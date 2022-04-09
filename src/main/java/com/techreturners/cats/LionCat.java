package com.techreturners.cats;

public class LionCat extends WildCat {

    public static final int AVERAGE_HEIGHT = 1100;
    public static final String ROAR = "Roar!!!!";

    @Override
    public int getAverageHeight() {
        return AVERAGE_HEIGHT;
    }

    @Override
    public String eat() {
        return ROAR;
    }
}
