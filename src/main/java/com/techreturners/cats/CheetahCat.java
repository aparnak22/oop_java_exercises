package com.techreturners.cats;

public class CheetahCat extends WildCat {

    private static final int AVERAGE_HEIGHT = 90;

    @Override
    public int getAverageHeight() {
        return AVERAGE_HEIGHT;
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}
