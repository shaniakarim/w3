package main;

public class Animal {
    private String species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public void run(int laps) {
        for (int i = 0; i < laps; i++) {
            System.out.println(this.name + " runs really fast!");
        }
    }

    @Override
    public String toString() {
        return species + ": " + name + ", " + age + " years";
    }
}
