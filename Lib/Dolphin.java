package Lib;

public class Dolphin extends Mammal implements Swimmable {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Clicking sounds";
    }

    @Override
    public String swim() {
        return "The dolphin playfully swims in the sea.";
    }
}
