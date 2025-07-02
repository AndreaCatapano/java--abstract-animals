public abstract class Animal {

    private String race;
    private String name;
    private int age;
    private float weight;

    public Animal(String race, String name, int age, float weight) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String sleep() {
        return ("Zzz");
    }

    public abstract String animalSound();

    public abstract String eat();
}
