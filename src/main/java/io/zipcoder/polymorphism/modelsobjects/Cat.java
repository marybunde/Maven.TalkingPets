package io.zipcoder.polymorphism.modelsobjects;

import io.zipcoder.polymorphism.interfaces.Pets;

public class Cat extends Pets {

    public Cat(String petName) {
        super(petName);
    }

    protected String speak() {
        return "meow";
    }
}
