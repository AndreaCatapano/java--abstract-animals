package org.lessons.java.animals;

public class Sparrow extends Animal {

    public Sparrow(String name, String race, int age, float weight) {
        super(race, name, age, weight);
    }

    @Override
    public String animalSound() {
        return "cip cip";
    }

    @Override
    public String eat() {
        return "Il passero mangia semi e cereali";
    }

}
