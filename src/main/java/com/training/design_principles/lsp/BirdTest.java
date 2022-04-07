package com.training.design_principles.lsp;

class BirdViolatingLsp {

    public boolean canFly;
    public BirdViolatingLsp(boolean canFly) {
        this.canFly = canFly;
    }
    public void fly() {
        if (canFly) {
            System.out.println("I'm flying");
        } else {
            System.out.println("I cannot fly");
        }
    }

    public void walk() {
        System.out.println("I'm walking");
    }
}

class Dove extends BirdViolatingLsp {
    public Dove(boolean canFly) {
        super(canFly);
    }

}

class Ostrich extends BirdViolatingLsp {

    public Ostrich(boolean canFly) {
        super(canFly);
    }
}
public class BirdTest{

}

