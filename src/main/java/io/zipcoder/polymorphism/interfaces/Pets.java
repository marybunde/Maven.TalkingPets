package io.zipcoder.polymorphism.interfaces;

public abstract class Pets {
    //Fields
    String name;

    //Constructors
    public  Pets(String petName){
        this.name = petName;
    }
    //Methods
    protected abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String petName) {
        this.name = petName;
    }
}
