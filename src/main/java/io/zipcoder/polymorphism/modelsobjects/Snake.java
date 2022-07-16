package io.zipcoder.polymorphism.modelsobjects;

import io.zipcoder.polymorphism.interfaces.Pets;

public class Snake extends Pets {

    public Snake(String petName) {
        super(petName);
    }

    protected String speak() {
        return "Hiss";
    }
}
