package com.training.java8.codereadability;

import java.util.Comparator;

public class AppleWeightComparator implements Comparator<Apple> {

    @Override
    public int compare(Apple o1, Apple o2) {
        return o2.getWeight()-o1.getWeight();
    }
}
