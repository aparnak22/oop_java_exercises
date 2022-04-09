package com.techreturners.cats;

public abstract class BaseCat implements Cat {
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
    public abstract String getSetting();

    @Override
    public abstract int getAverageHeight();

    @Override
    public abstract String eat();
}
