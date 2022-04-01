package com.techreturners.cats;

public class DomesticCat implements Cat {
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
        return null;
    }

    @Override
    public int getAverageHeight() {
        return 0;
    }

    @Override
    public String eat() {
        return null;
    }
}
