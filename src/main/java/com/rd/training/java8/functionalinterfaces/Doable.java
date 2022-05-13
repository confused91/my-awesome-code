package com.rd.training.java8.functionalinterfaces;

@FunctionalInterface
public interface Doable {

    void test();

    default void testable() {
        System.out.println("Testing testable from Doable.");
    }


}
