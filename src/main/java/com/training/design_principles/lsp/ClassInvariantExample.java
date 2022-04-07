package com.training.design_principles.lsp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;

public class ClassInvariantExample {
    static Logger logger= LogManager.getLogger(ClassInvariantExample.class);
    private final String name;

    public ClassInvariantExample(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ClassInvariantExample classInvariantExample= new ClassInvariantExample("Sharada");
//        classInvariantExample.name=null;

    }

}
