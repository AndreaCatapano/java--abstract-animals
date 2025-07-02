package org.lessons.java.animals;

public class Dog extends Animal {

    public Dog(String name, String race, int age, float weight) {
        super(race, name, age, weight);
    }

    @Override
    public String animalSound() {
        return "Bau Bau Bau";
    }

    @Override
    public String eat() {
        return "Il cane mangia crocchette e carne";
    }

}
