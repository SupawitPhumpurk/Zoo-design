import java.util.ArrayList;

import Lib.Animal;
import Lib.Dolphin;
import Lib.Eagle;
import Lib.Lion;
import Lib.Penguin;
import Lib.Flyable;
import Lib.Swimmable;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Lion"));
        animals.add(new Eagle("Eagle"));
        animals.add(new Penguin("Penguin"));
        animals.add(new Dolphin("Dolphin"));

           System.out.println("===  Sounds ===");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: " + animal.makeSound());
        }

        System.out.println("\n===  Abilities ===");
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                System.out.println(animal.getName() + " can fly: " + ((Flyable) animal).fly());
            }
            else if (animal instanceof Swimmable) {
                System.out.println(animal.getName() + " can swim: " + ((Swimmable) animal).swim());
            }
            else  {
                System.out.println(animal.getName() + ": is Walking." );
            }
        }
    }
}
