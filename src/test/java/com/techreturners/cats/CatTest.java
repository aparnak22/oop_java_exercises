package com.techreturners.cats;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        Cat domesticCat = new DomesticCat();
        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        assertTrue("Cat should be snoozing", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        Cat domesticCat = new DomesticCat();
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        Cat domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionSetting() {
        Cat wildCat = new LionCat();
        assertEquals("wild", wildCat.getSetting());
    }

    @Test public void checkLionHeight() {
        Cat lionCat = new LionCat();
        assertEquals(1100, lionCat.getAverageHeight());
    }


    @Test
    public void feedTheLion() {
        Cat lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }


    @Test
    public void checkCheetahSetting() {
        Cat wildCat = new LionCat();
        assertEquals("wild", wildCat.getSetting());
    }

    @Test public void checkCheetahHeight() {
        Cat cheetahCat = new CheetahCat();
        assertEquals(90, cheetahCat.getAverageHeight());
    }

    @Test
    public void feedTheCheetah() {
        Cat cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        Cat domesticCat = new DomesticCat();
        assertEquals("Purrrrrrr", domesticCat.eat());
    }

    @Test
    public void feedThePoshCat() {
        Cat domesticCat = new PoshDomesticCat();

        String eatResult ;
        int purrCount = 0;
        int notpurrCount = 0;

        //Act : Run the eat() method 5 times
        for (int i = 0; i < 5; i++) {
            eatResult = domesticCat.eat();
            if ("It will do I suppose".equals(eatResult)) notpurrCount++;
                else if ("Purrrrrrr".equals(eatResult)) purrCount++;

        }

        //The cat should purr and remarl atleast once each in the 5 times that it eats.
        assertTrue(purrCount > 0 );
        assertTrue(notpurrCount > 0 );

    }
}
