package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, name the zoo:");
        String zooName = scanner.nextLine();
        Zoo zoo = new Zoo(zooName);

        while (true) {
            System.out.println("1) Create a new animal, 2) List all animals, 3) Run animals, 0) End the program");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("What species?");
                String species = scanner.nextLine();
                System.out.println("Enter the name of the animal:");
                String name = scanner.nextLine();
                System.out.println("Enter the age of the animal:");
                int age = Integer.parseInt(scanner.nextLine());
                Animal animal = new Animal(species, name, age);
                zoo.addAnimal(animal);
            } else if (choice.equals("2")) {
                zoo.listAnimals();
            } else if (choice.equals("3")) {
                System.out.println("How many laps?");
                int laps = Integer.parseInt(scanner.nextLine());
                zoo.runAnimals(laps);
            } else if (choice.equals("0")) {
                System.out.println("Thank you for using the program.");
                break;
            } else {
                System.out.println("Wrong input value");
            }
        }

        scanner.close();
    }
}
