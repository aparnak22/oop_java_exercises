package com.techreturners.cats;

public class LionCat implements Cat {


    public static final int AVERAGE_HEIGHT = 1100;
    public static final String ROAR = "Roar!!!!";

    @Override
    public boolean isAsleep() {
        return false;
    }

    @Override
    public void goToSleep() {

    }

    @Override
    public void wakeUp() {

    }

    @Override
    public String getSetting() {
        return null;
    }

    @Override
    public int getAverageHeight() {
        return AVERAGE_HEIGHT;
    }

    @Override
    public String eat() {
        return ROAR;
    }
}
