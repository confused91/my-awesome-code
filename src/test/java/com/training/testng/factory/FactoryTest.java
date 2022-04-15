package com.training.testng.factory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class FactoryTest {

    @Factory
    public Object[]factoryMethod() {
        return new Object[]{
                new TestNgExample("Factory"),
                new TestNgExample("Method"),
                new TestNgExample("example")
        };
    }
}
