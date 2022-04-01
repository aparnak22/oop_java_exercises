package com.techreturners.cats;

public class DomesticCat implements Cat {
    final static String DOMESTIC = "domestic";
    final static int AVERAGE_HEIGHT = 23;
    public static final String PURR = "Purrrrrrr";

    private boolean isAsleep = false;

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }

    @Override
    public void goToSleep() {
        isAsleep = true;
    }

    @Override
    public void wakeUp() {
        isAsleep = false;
    }

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
