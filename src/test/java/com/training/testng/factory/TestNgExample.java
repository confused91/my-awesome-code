package com.training.testng.factory;

import com.training.testng.ConfigurationTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestNgExample {
    private String name;

//    @Factory(dataProvider = "dp")
    public TestNgExample(String name) {
        this.name = name;
    }

    @Test
    public void testParameterFromArgument() {
        System.out.println("name: " + name);
    }

    @DataProvider(name = "dp")
    public Object[][] dataProvider() {
        return new Object[][]{{"custom-a"}, {"custom-b"}};
    }
}

