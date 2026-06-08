import java.util.ArrayList;
import java.util.List;

class Animal {
}

class Dog extends Animal {
    String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog: " + name;
    }
}

public class Task2 {

    public static void addDogs(List<? super Dog> dogs) {

        dogs.add(new Dog("Tommy"));
        dogs.add(new Dog("Rocky"));
        dogs.add(new Dog("Bruno"));

        System.out.println("Dogs added successfully");
    }

    public static void main(String[] args) {

        List<Dog> dogList = new ArrayList<>();
        List<Animal> animalList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        addDogs(dogList);
        addDogs(animalList);
        addDogs(objectList);

        System.out.println(dogList);
        System.out.println(animalList);
        System.out.println(objectList);
    }
}