package com.training.testng;

import org.testng.annotations.BeforeClass;

public class ConfigurationTest {
    @BeforeClass
    public void setup()
    {
        System.out.println("Setup related information");
    }

}
