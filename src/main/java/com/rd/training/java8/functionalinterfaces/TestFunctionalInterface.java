package com.rd.training.java8.functionalinterfaces;

public class TestFunctionalInterface {
    public static void main(String[] args) {
        new Doable() {
            @Override
            public void test() {
                System.out.println("Doable");
            }
        }.test();
        Doable doable = () -> {
        };
        Doable doa = () -> System.out.println("Doable using lambda");
        doa.test();
    }
}
