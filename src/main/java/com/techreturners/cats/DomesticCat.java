package com.techreturners.cats;

public class DomesticCat extends BaseCat {

    final static String DOMESTIC = "domestic";
    final static int AVERAGE_HEIGHT = 23;
    public static final String PURR = "Purrrrrrr";

    @Override
    public String getSetting() {
        return DOMESTIC;
    }

    @Override
    public int getAverageHeight() {
        return AVERAGE_HEIGHT;
    }

    @Override
    public String eat() {
        return PURR;
    }
}
