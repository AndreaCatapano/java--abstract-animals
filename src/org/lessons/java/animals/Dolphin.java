package org.lessons.java.animals;

public class Dolphin extends Animal {

    public Dolphin(String name, String race, int age, float weight) {
        super(race, name, age, weight);
    }

    @Override
    public String animalSound() {
        return "plop plop";
    }

    @Override
    public String eat() {
        return "Il delfino mangia altri pesci";
    }
}
