package com.techreturners.cats;

import java.util.Random;

public class PoshDomesticCat extends DomesticCat{

    public static final String REMARK = "It will do I suppose";

    @Override
    public String eat() {
        return REMARK;
    }
}
