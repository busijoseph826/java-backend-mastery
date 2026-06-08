import java.util.ArrayList;
import java.util.List;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal: " + name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog: " + name;
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat: " + name;
    }
}

public class Task1 {

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Tommy"));
        dogs.add(new Dog("Rocky"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Kitty"));
        cats.add(new Cat("Snow"));

        printAnimals(dogs);
        printAnimals(cats);
    }
}