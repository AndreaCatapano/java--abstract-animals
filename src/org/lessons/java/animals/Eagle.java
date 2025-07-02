package org.lessons.java.animals;

public class Eagle extends Animal {

    public Eagle(String name, String race, int age, float weight) {
        super(race, name, age, weight);
    }

    @Override
    public String animalSound() {
        return "cri cri";
    }

    @Override
    public String eat() {
        return "L'acquila mangia la carne";
    }
}
